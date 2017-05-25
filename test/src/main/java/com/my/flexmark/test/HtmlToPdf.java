package com.my.flexmark.test;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.pdf.converter.PdfConverterExtension;
import com.vladsch.flexmark.profiles.pegdown.Extensions;
import com.vladsch.flexmark.profiles.pegdown.PegdownOptionsAdapter;
import com.vladsch.flexmark.util.options.MutableDataHolder;
import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;

public class HtmlToPdf {
    static final MutableDataHolder OPTIONS = PegdownOptionsAdapter.flexmarkOptions(
            Extensions.ALL & ~(Extensions.ANCHORLINKS | Extensions.EXTANCHORLINKS_WRAP)
    ).toMutable();

    static String getResourceFileContent(String resourcePath) {
        StringWriter writer = new StringWriter();
        getResourceFileContent(writer, resourcePath);
        return writer.toString();
    }

    private static void getResourceFileContent(final StringWriter writer, final String resourcePath) {
        InputStream inputStream = PdfConverterExtension.class.getResourceAsStream(resourcePath);
        try {
            IOUtils.copy(inputStream, writer, "UTF-8");
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static final String MD="C:/Users/LiJe/Desktop/cddw_user_guide_md/test/DevelopersGuide.md";
    public static final String HTML = "C:/Users/LiJe/Desktop/cddw_user_guide_md/test/DevelopersGuide_all.html";
	public static final String DEST = "C:/Users/LiJe/Desktop/cddw_user_guide_md/test/brasil.pdf";
	    
    public static void main(String[] args) throws IOException, DocumentException {

    	    
        final Parser PARSER = Parser.builder(OPTIONS).build();
        final HtmlRenderer RENDERER = HtmlRenderer.builder(OPTIONS).build();
        
        String line,CoverHtml,AllHtml="";
        String BodyHtml="";
        String header="";
        String footer="";
        CoverHtml=readFile("cover.html");
        
        InputStream fis = new FileInputStream(MD);
        InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);
        while((line = br.readLine()) != null)
        {
        	Node document = PARSER.parse(line);
        	BodyHtml += RENDERER.render(document);
        }
        AllHtml=CoverHtml+BodyHtml;
        //delete <!doctype html>
        AllHtml=AllHtml.replace("<!doctype html>","");
        PrintWriter out = new PrintWriter("DevelopersGuide_all.html");
        out.println(AllHtml);

        //translate 
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new HtmlToPdf().createPdf(DEST);
        
        //PdfConverterExtension.exportToPdf("flexmark-java.pdf", AllHtml,"", OPTIONS);
        br.close();
    }

    public static String readFile(String file) throws IOException{
    	String line,Html = "";
    	InputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);
		while((line = br.readLine()) != null)
        {
        	Html += line;
        }
		br.close();
		return Html; 
    }
    
    //itext html to pdf
    public void createPdf(String file) throws IOException, DocumentException {

        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        document.open();
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
        new FileInputStream(HTML), Charset.forName("cp1252"));
        document.close();
    }
}