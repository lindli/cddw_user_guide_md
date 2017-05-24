package com.my.flexmark.test;


import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.pdf.converter.PdfConverterExtension;
import com.vladsch.flexmark.profiles.pegdown.Extensions;
import com.vladsch.flexmark.profiles.pegdown.PegdownOptionsAdapter;
import com.vladsch.flexmark.util.options.MutableDataHolder;
import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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

    public static void main(String[] args) throws IOException {

        final Parser PARSER = Parser.builder(OPTIONS).build();
        final HtmlRenderer RENDERER = HtmlRenderer.builder(OPTIONS).build();
        
        String line,html="";
        InputStream fis = new FileInputStream("DevelopersGuide.md");
        InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);
        while((line = br.readLine()) != null)
        {
        	Node document = PARSER.parse(line);
            html += RENDERER.render(document);
        }
        /*String AllHtml="<link rel=\"stylesheet\" href=\"file:///C:/Users/LiJe/Desktop/github-markdown.css\"><style>body{box-sizing: border-box;min-width: 200px;max-width: 980px;margin: 0 auto;padding: 45px;}</style><body><article class=\"markdown-body\">"
              +html+"</article></body>";*/
        PdfConverterExtension.exportToPdf("flexmark-java.pdf", html,"", OPTIONS);
        System.out.println(html);
        //System.out.println(System.getProperty("user.dir"));
    }
}