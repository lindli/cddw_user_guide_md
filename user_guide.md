# ChemDraw Direct 2.0 User Guide  < ALT >
---
## Recent Additions

## 1 Introduction
ChemDraw Direct is a chemical structure drawing and editing tool designed to help you create high-quality chemical drawings. ChemDraw Direct consists of a drawing toolbar and document window. The document window lets you draw and edit chemical structures using the various drawing tools available in the ChemDraw Direct toolbar. This section introduces the ChemDraw Direct user interface and main ChemDraw Direct toolbar.



##2 Getting Started
This topics covered in this chapter will help you become familiar with the user interface:

### About ChemDraw Tutorials
There are seven tutorials available in the Tutorials chapter

 -  Tutorial 1: Drawing a Structure
 -  Tutorial 2: Using Rings
 -  Tutorial 3: Fischer Projections
 -  Tutorial 4: Perspective Drawings
 -  Tutorial 5: Newman Projections
 -  Tutorial 6: Stereochemistry
 -  Tutorial 7: Templates

 These tutorials provide step-by-step instructions to help you work with the ChemDraw tools.
 
### ChemDraw Direct Standard User Interface
The following is an example of a typical ChemDraw Direct user interface:

> ***Note***: *The user interface and toolbar may vary depending on the configuration of your ChemDraw Direct application*

![user_interface](assets/user_interface.PNG)

ChemDraw Direct user interface

### ChemDraw Direct Main Toolbar
The most common tools are included on the main toolbar. These include the bond, text, ring, and selection tools necessary for drawing structures.
The following drawing tools are available on the ChemDraw Direct toolbar.

<!--in ChemDraw16.0 User Guide there is a title named Documents,It is deleted and following contents are added in this guide -->

#### secondary tools
Some tools on the main toolbar have  secondary tools associated with them. These are indicated by a small black triangle in the lower right corner.Double click on the icon to show the secondary tools For example:

![secondary_tools](assets/secondary_tools.PNG)

### API Button
ChemDraw Direct has several API functions:
![API_buttons](assets/API_buttons.PNG)

### Sample page

## 3 Page Layout
### The Drawing Area
below toolbar not used by

### Viewing Drawings

#### Magnification
Magnification changes how large or small your drawing appears without changing its dimensions. 
#### Magnify
1.Select an object to keep in view as you magnify the drawing.

> ***Note***: *If you do not select an object, the last object drawn is the center point of the magnification*

2.Select an option below:

 - To increase the magnification, click on magnify icon on toolbar.
 - To reduce the magnification, click on Reduce button on toolbar.

<!--in ChemDraw16.0 User Guide  The Document Type,Printing,Saving Page Setup Settings,35mm Slide Boundary Guides and Tables are deleted  -->


<!-- the whole Chapter 4 named Preferences and Settings is deleted-->

## 4 Hotkeys
Hotkeys are organized into atom labels, bond types, and functions (such as adding a charge or displaying a bond).

> ***Note***:* You can't modify hotkeys and nicknames. The tables in this section refer to the default values.*

### Atom Keys
Use atom keys to insert atoms in a drawing using your keyboard. For example, place your mouse over an atom and press <3> to add a tert-butyl group.

| Atom Label | Key |
| ------| ------ | 
| A | a | 
| F | f | 
| Ph | P or 4 | 
| AC | A or 5 | 
| H | h | 
| Q* | q | 
| Br | b | 
| I | I | 
| R | r | 
| n-Bu | 1 | 
| K | k | 
| S | s | 
| s-Bu | 2 | 
| Me | m | 
| Si | S | 
| t-Bu | 3 | 
| N | n | 
| TMS | t | 
| Na | N | 
| X | x | 
| Cl | C or l |
| O | o | 
| COOCH3 | E | 
| D | d | 
| OTs | T | 
| CH2OH | 6 | 
| Et | e | 
| P | p |
| B | B |

### Bond Hotkeys
To modify a bond, place your mouse over the bond and select a key listed below.

| Function | Key |
| ------| ------ | 
| Change to single bond | 1 | 
| Change to dashed bond | d | 
| Change to double bond | 2 | 
| Change to wavy bond | y | 
| Change to triple bond | 3 | 
| Position a double bond to the left | l | 
| Change to quadruple bond | 4 | 
| Center a double bond | c | 
| Change to bold bond | b | 
| Position a double bond to the right | r | 
| Change to wedged bond | w | 
| Bring bond to front | f | 
| Change to hashed bond | H | 
| Open a bond properties text box | /(slash) or ? | 
| Change to hashed-wedged bond | h | 
| Fuse 5 membered ring | 5 | 
| Fuse 6 membered ring | 6 | 
| Fuse 7 membered ring | 7 | 
| Fuse 8 membered ring | 8 | 
| Create chair form of cyclohexane with two different orientations | 9 or 0 | 

### Function Hotkeys
To apply function hotkeys, place your mouse over an atom and press the appropriate key.

| Function |Key |
| ------| ------ | 
| Add an attachment point | . (period) | 
| Add an atom number | '(single quote) | 
| Add a negative charge | - | 
| Add a positive charge | + | 
| Open an atom label text box | < Enter > |
| Remove an atom label | < Backspace > or < Delete > | <!-- <space> in CDD2.0 is no use and <Enter>,<Backspace>,<Delete> are special -->
<!-- there is no such function hotkeys in CDD2.0-->
<!--| Sprout one bond | 0 |  | Sprout two bonds | 9 | | Sprout three bonds| 8 |  -->
<!--|Display the Atom Properties dialog box | /(slash) or ? | -->
<!--| Display the Choode Nickname dialog box | = (equals) | -->
### Shortcuts
Below is a list of key combinations for common tasks.
<!-- delete file,view parts--> 

#### Edit<!--delete some fuctions -->
| Command | Key Combination |
| ------| ------ | 
| Cut | CTRL+X | 
| Copy | CTRL+C | 
| Copy as CDXML | CTRL+D | 
| Paste | CTRL+V | 
| Select all | CTRL+A | 
| Undo | CTRL+Z | 
| Redo | SHIFT+CTRL+Z | 

#### Object<!--delete some fuctions -->
| Command | Key Combination |
| ------| ------ | 
| Select multiple objects | SHIFT+Click (with Lasso, Marquee, or Structure Perspective tools) | 
| Group selected objects | CTRL+G | 
| Ungroup objects | SHIFT+CTRL+G | 
| Flip horizontal | SHIFT+CTRL+H | 
| Flip vertical | SHIFT+CTRL+V | 
| Rotate 180° horizontal | ALT+SHIFT+CTRL+H | 
| Rotate 180° vertical | ALT+SHIFT+CTRL+V | 

#### Structure
| Command | Key Combination |
| ------| ------ | 
| Clean up structure | SHIFT+CTRL+K |
| Convert name to structure | SHIFT+CTRL+N | 
| Convert structure to name | ALT+CTRL+N | 

#### Text<!--delete some fuctions -->
| Command | Key Combination |
| ------| ------ | 
| Subscript selected character, or next character typed | F9 (in a label) |
| Superscript selected character, or next character typed | F10 (in a label) | 


#### Drawing<!-- delete a fuction using pen tool-->
| Command |Key Combination |
| ------| ------ | 
| Copy a selected object | CTRL+drag | 
| Copy a selected object(constrained to X and Y axes) | SHIFT+CTRL+drag | 
| Distort (limit resize to X or Y axis) | SHIFT+drag (with resize handle) | 
| Toggle the Lasso and the previous drawing tool | CTRL+ALT+Tab | 
| Change direction of a chain | CTRL+Drag (with alkane chain tool) | 
| Change orientation of double bonds | SHIFT+Click (with saturated double-bond ring tools) | 
| Create resonance delocalized ring | CTRL+Click (with ring tools except chairs) | 

### Nicknames

|    |    |   |    |    |    |
| -- | -- | --| -- | -- | -- |
| Ac | Bz | c-C7H13 | cyclopropyl |  DPIPS | i-C4H9 |
| Ad | BOM | c-C8H15 | Cys | DPTBS | i-C5H11| 
| Ala | Bs | c-Hx | Dan | DTBMS | i-Pr |
| Alloc | Bt | C10H20 | DEAE | DTBS | Ile |
| Allyl | Btm | C10H21 | DEIPS | Et | Im |
| Am | Bu | Cbz | DMIPS | Fmoc | Leu |
| Arg | Bzh | cHx | DMPM | Gln | Lys |
| Asn | Bzl | CoA | DMPS | Glu | m-C6H4 |
| Asp | BzOM | Cy | DMTr | Gly | m-Phenylene |
| Benzoyl | c-C3H5 | cyclobutyl | DNP | His | m-Tolyl |
| Benzyl | c-C4H7 | cycloheptyl | Dnp | i-Am | MDIPS |
| Bn | c-C5H9 | cyclooctyl | Dns | i-Bu | MDPS |
| Boc | c-C6H11 | cyclopentyl | DNS | i-C3H7 | Me |
| MEM | n-Pr | Phenyl | s-Butyl | TBDMS | Thr |
| Mes | N3 | Pht | s-C4H9 | TBDPS | TIPDS |
| Met | neo-Am | Piv | s-C5H11 | TBMPS | TIPS |
| MMTr | neo-C5H11 | PMB | SEM | TBS | TMS |
| MOM | Np | PMBM | Ser | TDS | Tos |
| MPM | o-C6H4 | PNB | SES | Tf | trans-Cinnamyl | 
| Ms | o-Phenylene | Poc | t-Am | Tfa | Troc |
| MTM | o-Tolyl | PPi | t-BOC | TFA | Trp |
| n-Am | p-C6H4 | Pr | t-Boc | Thexyl | Trt |
| n-Bu | p-Phenylene | Pro | t-Bu | THF | Ts |
| n-C3H7 | p-Tolyl | Pv | t-Butyl | Thf | Tyr |
| n-C4H9 | h | s-Am | t-C4H9 | THP | Val |
| n-C5H11 | Phe | s-Bu | t-C5H11 | Thp | Xyl|

## Basic Drawings

ChemDraw provides a variety of tools for drawing everything from simple chemical structures to complex reactions.In this section, we introduce basic techniques to help you create your first structures. We also explain how to add features,such as arrows and shapes, to enhance structures and reactions.

### Bonds
Using the ChemDraw Direct toolbar you can draw several types of bonds.

#### Drawing Bonds
All bonds, by default, are constrained to a fixed length and angle. To draw the first bond of your structure, select the Single Bond tool  in the Main toolbar and click in the document window. To draw another bond, click either end of the first bond.
 ![adding_an_atom](assets/adding_an_atom.PNG)
*Adding a bond to an atom*

You can draw a bond in any direction. Using a bond tool, click and drag from an existing atom or an empty area in the document window. The bond is drawn in the direction you drag the cursor.
 ![adding_a_bond](assets/adding_a_bond.PNG)
*Adding a bond by dragging*

> **Note**: *To suppress fixed lengths and fixed angles, press the <Alt> key on your keyboard as you drag the bond.*

> **Note**: *If you access ChemDraw Direct on a touch-driven device, some of the functions that require a keyboard are not available.*

#### Single Bonds

To draw a single bond, select the Single Bond tool.

#### Double Bonds

There are three ways to draw a double bond:

 - Draw a bond using the Double Bond tool.
 - Draw a single bond over an existing single bond.
 - Using any bond or selection tool, point to an existing bond and press <2> on your keyboard.

#### Double Either Bonds
Double either bonds, or crossed double bonds, indicate unspecified double bond configuration, or a mixture of configurations.
To draw a double either bond, use the double either bond tool ![double_either_bond_tool](assets/double_either_bond_tool.PNG)from the Multiple Bonds toolbar, or:
1. Draw a bond using the Wavy Bond tool.
2. Click the center of the bond to create a double bond.

#### Triple Bonds
There are two ways to draw a double bond:

 - Draw a bond using the Triple Bond tool.
 - Using the Solid, Dashed, or Bold Bond tool, drag from one end of an existing double bond to the other end.
 - Using any bond or selection tool, point to an existing bond and press <3> on your keyboard.


#### Quadruple Bonds
There are two ways to draw a quadruple bond:

 - Draw a bond using the Quadruple Bond tool.
 - Using the Solid, Dashed, or Bold Bond tool, drag from one end of an existing triple bond to the other end.
 - Using any bond or selection tool, point to an existing bond and type ‘4’ on your keyboard.


To change a quadruple bond into a single bond:

 1. Select any bond tool.
 2. Drag from one end of an existing quadruple bond to the other.

You can also draw multiple bonds by using Hotkeys.

> **Note**: *To reduce the bond order, select the Eraser tool and click the bond.*

#### Dative bonds
Dative bonds are a specific type of covalent bond in which the pair of electrons shared by the atoms in the formation of a bond is contributed by one of the atoms only. The atom contributing the pair of electrons is known as "donor" while the atom which does not contribute, but shares the pair of electrons, is referred to as "acceptor".
To draw a dative bond:

 - Select the Dative Bond tool.
 - Drag from the positive to the negative
 end (arrow head) of the dative bond.

Dative bonds are drawn with a fixed orientation in a window.
To change the orientation of a dative bond:

 - Click the bond using the dative bond tool.
 

#### Wedged Bonds
To draw a wedged bond:
 - Click one of the wedged bond tools.
 - Drag from the narrow end of the wedged bond to the wide end of the wedged bond.
 
Wedged bonds are drawn with a fixed orientation in a window.
To change the orientation of the wedged bond:

 - Click the bond using the wedged bond tool.

 > **Note**: *ChemDraw treats hashed wedged bonds with the narrow end in the plane of the screen and the wide end behind the plane*
 
 <!-- add the Acyclic Chains part -->
#### Acyclic Chains
To draw an acyclic chain, select the Acyclic Chain tool and choose one of the following options:

 - To draw a simple chain, click-drag in the document window.
 - To change direction while drawing, hold down the <Ctrl> key while dragging.
 - To draw a chain of a specific length, click in the document window and enter thechain length in the dialog that appears. Click Add. In the example below, a chain length of 5 atoms is specified.
![add_acyclic_chains](assets/add_acyclic_chains.PNG)


#### Changing Bonds
You can change bonds by:

 - Changing bond types
 - Changing bond alignment and orientation
 - Moving atoms
 - Layering bonds

##### Changing Bond Types
Change a single bond from one type to another using one of the following methods:

 - Select a bond tool and click an existing bond
 - With hotkeys. See "Shortcuts" 


##### Changing Double Bonds
To change one type of double bond to another:
1. Select the Bold, Dashed, or Solid Bond tool.
2. Click a double bond.
The double bond changes to the new bond type. One of the bonds in the double bond is always a solid or dashed bond.
> **Note**: *If you click a tautomeric bond (solid/dashed) again with the dashed bond tool, you create an aromatic double bond (dashed/dashed).*

##### Aligning Double Bonds
Double bonds can have one of three alignments relative to other bonds— above, below, and centered.
Above  ![double_bond_above](assets/double_bond_above.PNG)
Below  ![double_bond_below](assets/double_bond_below.PNG)
Centered  ![double_bond_centered](assets/double_bond_centered.PNG)

1. Click the bond tool used to create the existing double bond.
2. Click the center of the double bond.
<! -- delete the method using  right-click menu -->

##### Moving Atoms
To move an atom in a structure, click and drag it using a selection tool. To move two bonded atoms in a structure,click and drag the bond between them.
To move individual atoms:
1. Click a selection tool.
2. Point to the atom you want to move. A highlight box appears over the atom.
3. drag the atom.<!-- delete the shift button -->
> **Note**: *You can also move atoms using a selection tool. See "Moving Objects"* 

##### Reducing Ring Size
You can reduce the number of atoms in a ring. For example, you can convert cyclohexane to cyclopentane.
To reduce the ring size, do one of the following:

 - Using the selection tool,  point to an atom and drag. Release when one atom is on top of the other. The bond between the atoms disappears.
 - Using a bond tool, point to an atom and < SHIFT >+drag. Release when one atom is on top of the other. The bond between the atoms disappears.
 
##### Bond Crossing
When one bond crosses another, you can indicate which bond is in front. The bond which is behind has a small section cut out, so you can clearly discern which bond is front-most.
To move an object to the front position:
1. Select the object to move to the front.
2.  With hotkeys. See "Shortcuts" 
<!-- delete method using menu and the note about 3D viewing-->
![bond_crossing](assets/bond_crossing.PNG)

##### Fixed Bonds
By default, ChemDraw draws structures with fixed bond lengths and bond angles. The values of those lengths and angles is determined by the settings for the particular type of document. However, you can modify the behavior so that you are not constrained to fixed bonds and angles.

> **Note**: *To suppress fixed lengths and fixed angles, press the ALT key as you drag the bond.*

<!-- delete the parts about fix the length,angle and value -->

### Atoms
By default, when you draw structures with the various bond, ring, or chain tools, simple hydrocarbons are created.
You can add atom labels to the atoms using the Text tool. You can also use the Text tool to add textual captions to a document. For example, you can add the atom label “OH” to a drawing of toluene to create phenol:

![atom_atom_phenol](assets/atom_phenol.PNG)

1. Draw the toluene structure.
2. Using the Text tool, click the methyl carbon. A text field appears.
3. Type OH in the text field.
4. Click outside the text field.


To edit the atom label, click in the text field with the text tool and begin typing.
You can either enter the atom label in a text field or type the hotkey while hovering over an atom. For more information
about hotkeys, see "Hotkeys".
<!-- delete the part about periodic table -->

#### Repeating Atom Labels
You can repeat an atom label using the text, bond, or ring tools.

 1. Click the Text tool.
 2. Label a single atom.
 3. Do one of the following:
 - Using the Text tool, double-click another atom.
 - Using a bond, ring, or acyclic chain tool, triple-click another atom.


#### Deleting Labels
To delete an atom label, do one of the following:

 - Select the Eraser tool and click the atom label.
 - With a selection, bond, or ring tool selected, point to the atom label and press the < Backspace >, or < Delete > key. Note that if an atom is labeled, pressing the < Backspace >, or < Delete > key will delete the label, but not the atom. To delete the atom as well, press the < Delete > key a second time to delete the unlabeled atom
 

### Captions
You can add and edit captions to your structures using the Text tool. The following example adds the caption 'Phenol' to a phenol structure.
To add the caption ‘Phenol’ to a phenol structure:
1. Draw the phenol structure.
2. Using the Text tool, click below the drawing and type “Phenol” in the text field.
3. Click outside the text field.
To edit the caption, click in the text field with the Text tool and begin typing.
![atom_phenol_withname](assets/atom_phenol_withname.PNG)
To edit the caption, click in the text field with the Text tool and begin typing.

<!-- using caption size to takeplace the caption width part-->
#### Caption size
To edit the width of a caption:
1. Select the caption using the selection tool. Some resize handles appear around the caption.
2. Drag the resize handles to change the size of the caption.
<!-- delete Formatting,Coloring Text,About Fonts,Character Map and Hotkeys-->

<!-- add a part named Using Hotkey-->
### Using Hotkeys
Using hotkeys, you can add functional groups to your structures with one keystroke. For example, to add tert-butyl to the end of a hydrocarbon chain:
1. Draw the chain.
2. Hover the cursor where you want the functional group.
3. Press <3> (the hotkey for tert-butyl) on the keyboard. ‘t-Bu’ is added to the structure.
Using the hotkeys <n> (nitrogen), <o> (oxygen), and <i> (iodine), you can turn ethylbenzene into pyridin-2-yl hypoiodite.
![convert_ethylbenzene](assets/convert_ethylbenzene.PNG)
You can also label several atoms at a time. For example, you can change neopentane (figure A below) into methanetetraamine
(figure B):
![convert_neopentane](assets/convert_neopentane.PNG)
1. Create the neopentane structure.
2. Use < SHIFT >+click to select all the terminal carbon atoms and press <n> on the keyboard.

> **Note**: *For a complete list of hotkeys, see "Hotkeys"*

<!-- add a part named Nicknames-->
###  Nicknames
The simplest way to add an atomic symbol to a structure is to type the symbol into a text field. However, you are not limited to entering atoms one-at-a-time. Using nicknames, you can add functional groups, chains, or any other structural feature without drawing each atom.
A nickname is an alphanumeric abbreviation that represents a substructure. Nicknames are useful for drawing large structures or structures that repeatedly use similar features.
Note that you can assign a nickname to the structural feature. You can also assign hotKeys to nicknames that you
can later use as a quick way for adding the nickname to your drawing.

#### Applying Nicknames
To use a nickname to label an atom:
In a structure, double-click an atom with a bond tool, or click an atom with the Text tool. An atom label text field appears. Type a nickname label, such as “Et”.

An example is shown below:
![with_Et_nickname](assets/with_Et_nickname.PNG)

<!-- delete Expanding Nicknames,Annotations,Setting Default Atom Label Styles, Chemical Significance and Analysis Data-->

### Drawing Rings
The Main Toolbar contains the following ring tools that enable you to draw ring sizes and types:
![toolbar_rings](assets/toolbar_rings.PNG)
*Figure 6.3: a)cyclopropane; b)cyclopentane; c)cycloheptane; d)cyclohexane chair(1); e)cyclopentadiene; f)cyclobutane;
g)cyclohexane; h)cyclooctane; i) cyclohexane chair(2); j)benzene.*

To draw a ring:
1. From the Main toolbar, select a ring tool.
2. Click and drag in the canvas to orient the ring.
If you click an atom or bond with a ring tool in an existing structure, the ring is fused to it. You can also use hotkeys to fuse rings. For more information, see "Bond Hotkeys" . You can also reduce the size of the rings. For more information, see "Reducing Ring Size" .


#### Spiro and Sprout Rings
By default, clicking an atom in a ring using a ring tool forms a spiro link. If you click an atom it will sprout the ring.
![spiro_ring](assets/spiro_ring.PNG)

You can change this behavior by  pressing the < Alt > key on your keyboard so that a sprout bond appears instead of a spiro ring:

![sprout_ring](assets/sprout_ring.PNG)

#### Cyclohexane Chair Rings
You can draw cyclohexane chair rings in two orientations: horizontal and vertical. When you draw a cyclohexane chair ring by clicking, the chair is drawn in a horizontal orientation.

To orient a cyclohexane chair ring to a vertical orientation:
1. Click one of the Cyclohexane Chair Ring tools.
2. Click+drag in the structure to the orientation you want.

![cyclohexane_chair_rings](assets/cyclohexane_chair_rings.PNG)
*Figure 6.4: a)Horizontal orientation; b)Vertical orientation.*


#### Aromatic Structures
##### Delocalized Rings
You can draw a resonance delocalized ring using any ring tool except for the cyclohexane chairs.
1. Click a ring tool.
2. Press the CTRL key and drag or click in the document window.

![benzene](assets/benzene.PNG)
##### Resonance Structures
You can draw cyclopentadiene or benzene in multiple versions:

![cyclopentadiene](assets/cyclopentadiene.PNG)

The double bonds in the cyclopentadiene or benzene ring tools can be drawn in either of two forms. Normally, the first bond drawn is a double bond. This is the orientation indicated on the cyclopentadiene and benzene Ring tool pointers. To draw, click in the document window with either the cyclopentadiene or benzene drawing tool.To shift the orientation so the first bond drawn is a single bond, do the following:

 - < Shift >+drag from the beginning of the first single bond to the end of the single bond.

### Chains
You can draw hydrocarbon chains using either the Acyclic chain tool or Snaking chain tool. Use the Acyclic chain tool
to draw straight hydrocarbon chains.
1. Select the Acyclic chain tool.
2. Click and drag in the document window in the direction you want the chain to grow. The number at the end of the chain indicates how many atoms you have drawn.

#### Changing Chain Direction
To change the direction as you draw, use the Snaking chain tool, or press the < Control > key with Acyclic tool selected, while drawing in the direction you want.

> **Note**: *Release the mouse button before you release the < Control > key.*

<!-- delete  Fixed Lengths,Fixed Angles-->

#### Adding Chains to Structures
To add an Acyclic chain to an existing structure, click an atom in the structure. Click and drag in the direction you want to draw the chain.

#### Specifying Chain Length
To specify the exact length of a chain before you draw it:
1. Select the Acyclic chain tool.
2. Click an existing atom or an empty area in a document window. The Add Chain dialog appears.
3. Type the number of carbon atoms in the chain.
4. Click Add.

To add another chain of the same length anywhere in a document window, <ALT>+click where you want the chain to begin.

### Objects
Use the tools on the main toolbar to add shapes to your documents. You can rotate an object using its rotation handle and scale or distort an object by using the resize or distortion handles.

 <!-- delete the discribtion about Fixed Angles and the use of pen tools-->

#### Arrows 
You can use arrows to show the conversion of reactants to products and to indicate electron flow. You can customize arrows not only for length and angle, but for arrowhead width and shape. You can also drag an arrow from its middle to create an arc of any length. When you create an arc, the angle of the arrow is modified.
When you mouse-over an arrow with the Lasso, Marquee, or an Arrow tool selected, the adjustment handles appear,
for example:
Drag the adjustment handles to change the arrow length, angle, or shape. 

##### Arrow Heads
There are three arrow head shapes: solid, hollow, and angled. 

![arrow_heads](assets/arrow_heads.PNG)
*Arrow heads shapes are: A) Solid arrow head; B) Hollow head; and C) Angled head.*

##### Arrow Types
ChemDraw offers a variety of arc types and arrow types, such as, crossed (no-go) arrows, equilibrium arrows of unequal lengths, and elliptical arcs.
###### Arc Arrows
There are two ways to create an arc arrow:

 1. Click and drag the arc adjustment handle of a straight arrow.
![arc_adjustment_handle](assets/arc_adjustment_handle.PNG)
*Figure 6.5: A) Arc adjustment handle*
 2.  Select an arc arrow from the Arrows palette.
You can customize arc arrows as easily as straight arrows. Some examples are:
![arc_arrow_examples](assets/arc_arrow_examples.PNG)
a. To undo all changes made to an arrow except for the change in length, click the arrow with the same arrow tool.
b.  Click an unmodified arrow, or one that has had only its length changed, to reverse its direction.

###### Hollow Arrows
You can rotate hollow arrows and change their length and width. You can also modify the angle and create hollow arc arrows, just as with regular arrows.
![hollow_arrow](assets/hollow_arrow.PNG)


##### Connecting Arrows
You can connect a new arrow to an existing arrow at either end or at the midpoint.
For example, to draw a new arrow starting at the midpoint of an existing arrow:
1. Select from the Arrows palette an arrow type for the new arrow.
2. Place your cursor over the midpoint of the existing arrow and hold down the <shift> key. The adjustment handle
changes to a small highlighted rectangle and the cursor changes to the '+' symbol.
3. While pressing the < shift > key, draw the new arrow starting from the existing arrow’s midpoint.

![connect_arrow_midpoint](assets/connect_arrow_midpoint.PNG)

You can also drag existing arrows and connect them. Here are a few examples:

![arrow_connect_examples](assets/arrow_connect_examples.PNG)

##### Equilibrium Arrows
With equilibrium arrows, changing the length changes both arrows proportionately; changing the shape of the arrowhead changes both arrowheads identically.

![equilibrium_arrow](assets/equilibrium_arrow.PNG)

To change the length of one arrow, hold down the <Alt> key. Two new adjustment handles appear. When adjusting one arrow of an equilibrium arrow, the arrow cannot be extended beyond its original length.

![changed_equilibrium_arrow](assets/changed_equilibrium_arrow.PNG)

##### Curved Arrows
You can curve most arrows found on the Arrows toolbar. After you paste an arrow in your drawing, click and drag the selection point in the middle of the arrow.
As you drag the selection point, the angle of the arc appears, measured in degrees.

<!-- delete Colored Arrows, Drawing Elements, Circles and Ovals -->

#### Brackets
Brackets includes braces { },brackets [ ],parentheses ( ) and dagger. Brackets are commonly used to illustrate polymers. For
more information on polymers, see "Polymers" .

##### Single brackets
You can draw a single bracket in any orientation. Select a single bracket tool from the Brackets palette.

![single_brackets](assets/single_brackets.PNG)

1. Point where you want the bracket to start.
2. Drag from one end of the bracket to the other end.

##### Paired Brackets
Paired brackets can be placed only in a vertical orientation. However, once you draw paired brackets, you can then select them and rotate to a horizontal position or any orientation desired. A rectangle or box defines their position.
To draw paired brackets:
1. Select a paired bracket tool from the Brackets palette.
2. Point where you want a corner of the bracket.
3. Drag diagonally from one corner of the box to the opposite corner.


##### Daggers
To draw a dagger:
1. Select a dagger tool from the Brackets palette.
2. Click in the drawing window.

> **Note**: *To resize a dagger, select the dagger and click and drag one of its resize handles.*

<!-- delete  Framing Obejects , Pen Tools, Editing Curves -->

#### Selecting Objects
Use the Lasso for freehand selections and the Marquee to select rectangular regions.

![selecting_objects](assets/selecting_objects.PNG)

When you select a structure or object, the selection displays with a colored frame around it. The frame includes
handles for rotating, distorting, and resizing your selection.

##### The Lasso Tool
Use the Lasso tool to make a freehand selection of irregular areas.
To select objects using the Lasso tool:

1. Select the Lasso tool.
2. Press the mouse button while the pointer is not over any object.
3. Drag around part of a structure or other object.

As you drag, a line appears that defines the selection area. Bonds, structures, or other objects are selected only if they are entirely within this area.

##### The Marquee Tool
Use the Marquee tool to select objects and structures within a rectangular area.

1. Select the Marquee tool.
2. Click and drag diagonally over the structures or other object.


As you drag, a rectangle appears that defines the selection area. Non-molecular objects are selected only if their center or at least a major portion of the object is within the selection triangle.
To set one selection tool to behave like the other, click either one of the tools while pressing < Alt > .
To toggle a selection tool and the last drawing tool used, press < Control >+< Alt >+< Tab > .
Selecting Entire Structures
To select an entire chemical structure, double-click a bond or atom in the structure using a selection tool.
If the chemical structure or other object is part of a group, the group is selected.
Selecting Objects by Clicking
1. Select the Lasso or Marquee tool.
2. Point to an object in a document window.
A highlight box appears over the pointed object.
3. Click the object.
The selected objects appear within the selection rectangle and the cursor changes to a hand.
Note: You can also select the individual objects in a group. See "Grouping Objects"
