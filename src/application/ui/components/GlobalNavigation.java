package application.ui.components;

import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class GlobalNavigation extends HBox {

	private Button save;
	private Button close;
	private Button clear;
	private Button export;
	private Button share;
	
	public GlobalNavigation() {
		
		super(35);
		setBackground(Background.fill(new Color(.6, .8, 1, 1)));
		
		save = new Button("Save");
		close = new Button("Close");
		clear = new Button("Clear");
		export = new Button("Export");
		share = new Button("Share");
		
		getChildren().addAll(save, close, clear, export, share);
		setMinWidth(1920);
		setMinHeight(75);
		
	}
	
}
