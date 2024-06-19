package com.labolida.explorer.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JTable;

public class Style {

	public static void render( Component comp ) {
		
		
		/* GENERAL COLORS*/
		comp.setBackground( new Color(255,255,255) );
		comp.setForeground( new Color(50,50,50) );
		
		
		//Font font= new Font("Times New Roman", Font.PLAIN, 20);
		//Font font= new Font("Courier", Font.PLAIN, 16);
		Font font= new Font("DejaVu Sans Mono", Font.PLAIN, 14);
		
		comp.setFont(font);
		
		
		/* JTABLE */
		if (comp instanceof JTable) {
			JTable jtable = (JTable) comp ;
			jtable.setGridColor( new Color(240,240,240) );
			jtable.setRowHeight(20);
		}
		
		/* LIST FONT s name
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String fonts[] = ge.getAvailableFontFamilyNames(); 
        for (String i : fonts) { 
            System.out.println(i + " "); 
        }
        */
	}
	
}
/*
aakar 
Abyssinica SIL 
Ani 
AnjaliOldLipi 
Bitstream Charter 
Bitstream Vera Sans 
Bitstream Vera Sans Mono 
Bitstream Vera Serif 
C059 
Century Schoolbook L 
Chandas 
Chilanka 
Courier 10 Pitch 
D050000L 
DejaVu Sans 
DejaVu Sans Mono 
DejaVu Serif 
Dialog 
DialogInput 
Dingbats 
Droid Sans Fallback 
Dyuthi 
FreeMono 
FreeSans 
FreeSerif 
Gargi 
Garuda 
Gayathri 
Gayathri Thin 
Gubbi 
Jamrul 
KacstArt 
KacstBook 
KacstDecorative 
KacstDigital 
KacstFarsi 
KacstLetter 
KacstNaskh 
KacstOffice 
KacstOne 
KacstPen 
KacstPoster 
KacstQurn 
KacstScreen 
KacstTitle 
KacstTitleL 
Kalapi 
Kalimati 
Karumbi 
Keraleeyam 
Khmer OS 
Khmer OS System 
Kinnari 
Laksaman 
Liberation Mono 
Liberation Sans 
Liberation Sans Narrow 
Liberation Serif 
Likhan 
LKLUG 
Lohit Assamese 
Lohit Bengali 
Lohit Devanagari 
Lohit Gujarati 
Lohit Gurmukhi 
Lohit Kannada 
Lohit Malayalam 
Lohit Odia 
Lohit Tamil 
Lohit Tamil Classical 
Lohit Telugu 
Loma 
Lucida Bright 
Lucida Sans 
Lucida Sans Typewriter 
Manjari 
Manjari Thin 
Meera 
Mitra Mono 
Monospaced 
mry_KacstQurn 
Mukti Narrow 
Nakula 
Navilu 
Nimbus Mono L 
Nimbus Mono PS 
Nimbus Roman 
Nimbus Roman No9 L 
Nimbus Sans 
Nimbus Sans L 
Nimbus Sans Narrow 
Norasi 
Noto Color Emoji 
Noto Mono 
Noto Sans CJK HK 
Noto Sans CJK JP 
Noto Sans CJK KR 
Noto Sans CJK SC 
Noto Sans CJK TC 
Noto Sans Mono CJK HK 
Noto Sans Mono CJK JP 
Noto Sans Mono CJK KR 
Noto Sans Mono CJK SC 
Noto Sans Mono CJK TC 
Noto Serif CJK JP 
Noto Serif CJK KR 
Noto Serif CJK SC 
Noto Serif CJK TC 
OpenSymbol 
P052 
Padauk 
Padauk Book 
padmaa 
padmaa-Bold.1.1 
Pagul 
Phetsarath OT 
Pothana2000 
Purisa 
Rachana 
RaghuMalayalamSans 
Rasa 
Rasa Light 
Rasa Medium 
Rasa SemiBold 
Rekha 
Saab 
Sahadeva 
Samanata 
Samyak Devanagari 
Samyak Gujarati 
Samyak Malayalam 
Samyak Tamil 
SansSerif 
Sarai 
Sawasdee 
Serif 
Standard Symbols L 
Standard Symbols PS 
Suruma 
Tibetan Machine Uni 
Tlwg Typist 
Tlwg Typo 
TlwgMono 
TlwgTypewriter 
Ubuntu 
Ubuntu Condensed 
Ubuntu Light 
Ubuntu Mono 
Ubuntu Thin 
Umpush 
Uroob 
URW Bookman 
URW Bookman L 
URW Chancery L 
URW Gothic 
URW Gothic L 
URW Palladio L 
utkal 
Vemana2000 
Waree 
Yrsa 
Yrsa Light 
Yrsa Medium 
Yrsa SemiBold 
Z003 
*/
