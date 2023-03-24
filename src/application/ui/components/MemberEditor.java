package application.ui.components;

import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class MemberEditor extends VBox {

	private Button save;
	private Button close;
	private Button clear;
	private Button export;
	private Button share;
	
	public MemberEditor() {
		
		super(35);
		save = new Button("Save");
		close = new Button("Close");
		clear = new Button("Clear");
		export = new Button("Export");
		share = new Button("Share");
		
		getChildren().addAll(save, close, clear, export, share);
		setBackground(Background.fill(new Color(.4, .6, .9, 1)));
		setMinHeight(4000);
		setMinWidth(300);
	}
	
}
