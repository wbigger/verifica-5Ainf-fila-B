
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(300,700);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb=new StringBuilder ("<html>");
	
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<h1>speedtest</h1>");
		sb.append("<div style='display:table-table'>");
		sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("date");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("up(ubps)");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("down(ubps)");
		sb.append("</div>");
		sb.append("</div>");//fine prima riga
		
        sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("1/07/18");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("25,0");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("28,9");
		sb.append("</div>");
		sb.append("</div>");//fine seconda riga
		
        sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("7/09/18");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("24,6");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("1,99");
		sb.append("</div>");
		sb.append("</div>");//fine seconda riga
		sb.append("</div>");
		
		
		String html=sb.toString();
	
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

