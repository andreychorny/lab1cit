package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	@FXML
	private TextArea gr11;
	@FXML
	private TextArea gr12;
	@FXML
	private TextArea gr13;
	@FXML
	private TextArea gr14;
	@FXML
	private TextArea gr15;
	@FXML
	private TextArea gr16;
	@FXML
	private TextArea gr17;
	@FXML
	private TextArea gr21;
	@FXML
	private TextArea gr22;
	@FXML
	private TextArea gr23;
	@FXML
	private TextArea gr24;
	@FXML
	private TextArea gr25;
	@FXML
	private TextArea gr26;
	@FXML
	private TextArea gr27;
	@FXML
	private TextArea gr31;
	@FXML
	private TextArea gr32;
	@FXML
	private TextArea gr33;
	@FXML
	private TextArea gr34;
	@FXML
	private TextArea gr35;
	@FXML
	private TextArea gr36;
	@FXML
	private TextArea gr37;
	@FXML
	private TextArea inputFile;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	@FXML
	public void ReadFile(){
		Scanner n = null;
		try {
			n = new Scanner(new File(inputFile.getText()));
			gr11.setText(((Integer)n.nextInt()).toString());
			gr12.setText(((Integer)n.nextInt()).toString());
			gr13.setText(((Integer)n.nextInt()).toString());
			gr21.setText(((Integer)n.nextInt()).toString());
			gr22.setText(((Integer)n.nextInt()).toString());
			gr23.setText(((Integer)n.nextInt()).toString());
			gr31.setText(((Integer)n.nextInt()).toString());
			gr32.setText(((Integer)n.nextInt()).toString());
			gr33.setText(((Integer)n.nextInt()).toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			n.close();
		}
		
	}
	@FXML
	 public void onClickMethod(){
		wild();
		gurv();
		lapl();
		baylapl();
	}
	public void wild(){
		Integer numGr11 = Integer.parseInt(gr11.getText());
		Integer numGr12 = Integer.parseInt(gr12.getText());
		Integer numGr13 = Integer.parseInt(gr13.getText());
		Integer numGr21 = Integer.parseInt(gr21.getText());
		Integer numGr22 = Integer.parseInt(gr22.getText());
		Integer numGr23 = Integer.parseInt(gr23.getText());
		Integer numGr31 = Integer.parseInt(gr31.getText());
		Integer numGr32 = Integer.parseInt(gr32.getText());
		Integer numGr33 = Integer.parseInt(gr33.getText());
		Integer min1 = Math.min(Math.min(numGr11, numGr12),numGr13);
		Integer min2 = Math.min(Math.min(numGr21, numGr22),numGr23);
		Integer min3 = Math.min(Math.min(numGr31, numGr32),numGr33);
		gr14.setText(min1.toString());
		gr24.setText(min2.toString());
		gr34.setText(min3.toString());
		Integer max = Math.max(Math.max(min1, min2), min3);
	    if(min1==max)gr14.setStyle( "-fx-border-color: red; -fx-border-width:3");
	    if(min2==max)gr24.setStyle("-fx-border-color: red; -fx-border-width:3");
	    if(min3==max)gr34.setStyle( "-fx-border-color: red; -fx-border-width:3");

	}
	public void gurv(){
		Integer numGr11 = Integer.parseInt(gr11.getText());
		Integer numGr12 = Integer.parseInt(gr12.getText());
		Integer numGr13 = Integer.parseInt(gr13.getText());
		Integer numGr21 = Integer.parseInt(gr21.getText());
		Integer numGr22 = Integer.parseInt(gr22.getText());
		Integer numGr23 = Integer.parseInt(gr23.getText());
		Integer numGr31 = Integer.parseInt(gr31.getText());
		Integer numGr32 = Integer.parseInt(gr32.getText());
		Integer numGr33 = Integer.parseInt(gr33.getText());
		Integer min1 = Math.min(Math.min(numGr11, numGr12),numGr13);
		Integer min2 = Math.min(Math.min(numGr21, numGr22),numGr23);
		Integer min3 = Math.min(Math.min(numGr31, numGr32),numGr33);
		Integer max1 = Math.max(Math.max(numGr11, numGr12),numGr13);
		Integer max2 = Math.max(Math.max(numGr21, numGr22),numGr23);
		Integer max3 = Math.max(Math.max(numGr31, numGr32),numGr33);
		Double h1 = (double) ((min1+max1)/2);
		Double h2 = (double) ((min2+max2)/2);
		Double h3 = (double) ((min3+max3)/2);
		gr16.setText(h1.toString());
		gr26.setText(h2.toString());
		gr36.setText(h3.toString());
		Double max = Math.max(Math.max(h1, h2), h3);
	    if(h1.equals(max))gr16.setStyle( "-fx-border-color: red; -fx-border-width:3" );
	    if(h2.equals(max))gr26.setStyle( "-fx-border-color: red; -fx-border-width:3" );
	    if(h3.equals(max))gr36.setStyle( "-fx-border-color: red; -fx-border-width:3" );
	}
	public void lapl(){
		Integer numGr11 = Integer.parseInt(gr11.getText());
		Integer numGr12 = Integer.parseInt(gr12.getText());
		Integer numGr13 = Integer.parseInt(gr13.getText());
		Integer numGr21 = Integer.parseInt(gr21.getText());
		Integer numGr22 = Integer.parseInt(gr22.getText());
		Integer numGr23 = Integer.parseInt(gr23.getText());
		Integer numGr31 = Integer.parseInt(gr31.getText());
		Integer numGr32 = Integer.parseInt(gr32.getText());
		Integer numGr33 = Integer.parseInt(gr33.getText());
		Double h1 =  (((double)(numGr11+numGr12+numGr13))/3);
		Double h2 =  (((double)(numGr21+numGr22+numGr23))/3);
		Double h3 =  (((double)(numGr31+numGr32+numGr33))/3);
		gr17.setText(String.format("%6.2f", h1));
		gr27.setText(String.format("%6.2f", h2));
		gr37.setText(String.format("%6.2f", h3));
		Double max = Math.max(Math.max(h1, h2), h3);
	    if(h1.equals(max))gr17.setStyle("-fx-border-color: red; -fx-border-width:3" );
	    if(h2.equals(max))gr27.setStyle( "-fx-border-color: red; -fx-border-width:3" );
	    if(h3.equals(max))gr37.setStyle("-fx-border-color: red; -fx-border-width:3" );
	}
	public void baylapl(){
		Integer numGr11 = Integer.parseInt(gr11.getText());
		Integer numGr12 = Integer.parseInt(gr12.getText());
		Integer numGr13 = Integer.parseInt(gr13.getText());
		Integer numGr21 = Integer.parseInt(gr21.getText());
		Integer numGr22 = Integer.parseInt(gr22.getText());
		Integer numGr23 = Integer.parseInt(gr23.getText());
		Integer numGr31 = Integer.parseInt(gr31.getText());
		Integer numGr32 = Integer.parseInt(gr32.getText());
		Integer numGr33 = Integer.parseInt(gr33.getText());
		Double h1 = (double) numGr11 * 0.5 +(double) numGr12 * 0.35 +(double) numGr13 * 0.15;
		Double h2 = (double)numGr21 * 0.5 + (double)numGr22 * 0.35 + (double)numGr23 * 0.15;
		Double h3 = (double)numGr31 * 0.5 + (double)numGr32 * 0.35 + (double)numGr33 * 0.15;
		gr15.setText(h1.toString());
		gr25.setText(h2.toString());
		gr35.setText(h3.toString());
		Double max = Math.max(Math.max(h1, h2), h3);
	    if(h1.equals(max))gr15.setStyle( "-fx-border-color: red; -fx-border-width:3" );
	    if(h2.equals(max))gr25.setStyle( "-fx-border-color: red; -fx-border-width:3" );
	    if(h3.equals(max))gr35.setStyle("-fx-border-color: red; -fx-border-width:3" );
	}
}
