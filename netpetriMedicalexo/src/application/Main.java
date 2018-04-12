package application;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
 import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Main extends Application {
//Button btnRun;
	public ListView<String> listView;
	public static ObservableList<String> observableList;


	
	Arrow a1,a2,a3,a4,a5,a6,a7,a8;
	Rectangle r,r2,r3;
	Text txtR,txtR2,txtR3;
	Text txtC,txtC2,txtC3,txtC4;

	Circle c,c2,c3,c4;
	DropShadow nodeShadow = new DropShadow();

	Médecins médecins;
	salleAttente salleAttente;
     int i ;

	sallExaminDisponible sallExaminDisponible;
	SallExaminOcupée SallExaminOcupée;
	public void CreationObject() {
		  salleAttente=new salleAttente(c, txtC);
		  salleAttente.setTxt(5);
		  SallExaminOcupée=new SallExaminOcupée(c2, txtC2);
		  médecins=new Médecins(c3, txtC3);
		  médecins.setTxt(3);
		 sallExaminDisponible=new sallExaminDisponible(c4, txtC4);
		 sallExaminDisponible.setTxt(2);

	}

	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			observableList=FXCollections.observableArrayList();
			listView =new ListView<String>(observableList);
			VBox vbox=new VBox(20);
			vbox.setPadding(new Insets(20));
			vbox.getChildren().addAll(listView);
		

			r  = new Rectangle(); 
			txtR=new Text("T1 ");
			AddTransaction(r,txtR,175,40);

			a1  = new Arrow(200, 50, 200, 100);
			c=new Circle(  25);
			txtC=new Text("1");
			AddPlase(c,txtC,200,125);
			a2  = new Arrow(200, 150, 200, 200);
			r2  = new Rectangle(); 
			txtR2=new Text("T2 ");
			AddTransaction(r2,txtR2,175,200);
			a3  = new Arrow(200, 210, 200, 300);

			c2=new Circle(  25);
			txtC2=new Text("0");
			AddPlase(c2,txtC2,200,325);

			a4  = new Arrow(200, 350, 200, 400);
			r3  = new Rectangle(); 
			txtR3=new Text("T3 ");
			AddTransaction(r3,txtR3,175,400);

			c3=new Circle(  25);
			txtC3=new Text("3");
			AddPlase(c3,txtC3,400,200);

			a5  = new Arrow(220,400, 375, 215);
			a6  = new Arrow(375, 200, 225, 200);
			c4=new Circle(  25);
			txtC4=new Text("0");

			AddPlase(c4,txtC4,50,200);

			a7  = new Arrow(175,400,75,215);
			a8  = new Arrow(75,200, 175, 200);
			CreationObject();
			HBox hbox = new HBox();

			Button Run=new Button("Run");
			Run.setMinWidth(110);
			Run.setMinHeight(20);
			Run.setPadding(new Insets(0));
			
			hbox.getChildren().add(Run);
		 

			Run.setOnAction(new EventHandler() {
				@Override
				public void handle(Event arg0) {
					observableList.clear();
					i =0;
 					//Transaction1();		 
					 	 new Thread(){
							  
						      public void run() {
					        
						           try{
										while (salleAttente.getTxt()>0) {
 	 long randomNum =   0 + (long)(Math.random() * 2000);
  if (randomNum>1000) {
 	 Transaction1();

	// System.out.println("M"+i+++"= ["+salleAttente.getTxt()+","+médecins.getTxt()+","+sallExaminDisponible.getTxt()+","+SallExaminOcupée.getTxt()+"]");
 	Platform.runLater(new Runnable(){

		@Override
		public void run() {
			 observableList.add("M"+i+++"= ["+salleAttente.getTxt()+","+médecins.getTxt()+","+sallExaminDisponible.getTxt()+","+SallExaminOcupée.getTxt()+"]");

		}
		});  Thread.sleep(1000 + (long)(Math.random() * 2000)); 
    r. setFill(Color.web("#44d9ff"));

}

 			while (sallExaminDisponible.getTxt()>0) {
												Transaction2();
												// System.out.println("M"+i+++"= ["+salleAttente.getTxt()+","+médecins.getTxt()+","+sallExaminDisponible.getTxt()+","+SallExaminOcupée.getTxt()+"]");
												Platform.runLater(new Runnable(){

													@Override
													public void run() {
														 observableList.add("M"+i+++"= ["+salleAttente.getTxt()+","+médecins.getTxt()+","+sallExaminDisponible.getTxt()+","+SallExaminOcupée.getTxt()+"]");

													}
													});
								              Thread.sleep(1000+ (long)(Math.random() * 1000));
								            	
											}
										 r2. setFill(Color.web("#44d9ff"));
							 			 Transaction3();
							 		//	 System.out.println("M"+i+++"= ["+salleAttente.getTxt()+","+médecins.getTxt()+","+sallExaminDisponible.getTxt()+","+SallExaminOcupée.getTxt()+"]");
							 			Platform.runLater(new Runnable(){

											@Override
											public void run() {
												 observableList.add("M"+i+++"= ["+salleAttente.getTxt()+","+médecins.getTxt()+","+sallExaminDisponible.getTxt()+","+SallExaminOcupée.getTxt()+"]");

											}
											});
							 			 Thread.sleep(1000 + (long)(Math.random() * 1000));
								             r3. setFill(Color.web("#44d9ff"));
								              Thread.sleep(1000 + (long)(Math.random() * 1000));

									}
						        		

						          } catch(InterruptedException v){System.out.println(v);}
						      }
						  }.start();
				}
			});
			 r.setOnMouseClicked(new EventHandler() {

				@Override
				public void handle(Event arg0) {
					Transaction1();	
		            r. setFill(Color.web("#44d9ff"));

				}
			}); 
		 root.getChildren().addAll(hbox,a1,c,txtC,r,txtR,a2,r2,txtR2,a3,c2,txtC2,a4,r3,txtR3,c3,txtC3,a5,a6,c4,txtC4,a7,a8);
			
		 root.setRight(vbox);
		 Scene scene = new Scene(root,700,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private void AddPlase(Circle c,Text txtC,int x,int y) {


		c.setLayoutX(x);
		c.setLayoutY(y);

		c.setFill(Color.web("#ccf3ff"));
		nodeShadow.setOffsetY(4.0);
		c.setEffect(nodeShadow);
		StackPane pane=new StackPane();
		txtC.setX(x);
		txtC.setY(y);
		txtC.setFill(Color.BLACK);
		pane.getChildren().addAll(c,txtC);
	}

	/**
	 * 
	 */
	public void Transaction1() {
		
		salleAttente.setTxt(salleAttente.getTxt()+1);
        r. setFill(Color.web("#123456"));


	}
	public boolean Transaction2() {
		if (salleAttente.isEmpty()&&médecins.isEmpty()&&sallExaminDisponible.isEmpty()) {
			
			salleAttente.setTxt(salleAttente.getTxt()-1);
			médecins.setTxt(médecins.getTxt()-1);
			sallExaminDisponible.setTxt(sallExaminDisponible.getTxt()-1);
			SallExaminOcupée.setTxt(SallExaminOcupée.getTxt()+1);
r2.setFill(Color.web("#123456"));
		}
		return (salleAttente.isEmpty()&&médecins.isEmpty()&&sallExaminDisponible.isEmpty());  
		


	}
	public void Transaction3() {
		if (SallExaminOcupée.isEmpty()) {
			//salleAttente.setTxt(salleAttente.getTxt()+1);
			médecins.setTxt(médecins.getTxt()+1);
			sallExaminDisponible.setTxt(sallExaminDisponible.getTxt()+1);
			SallExaminOcupée.setTxt(SallExaminOcupée.getTxt()-1);

            r3. setFill(Color.web("#123456"));

		}  


	}
	private void AddTransaction(Rectangle r,Text txtR,int x,int y) {
		//r  = new Rectangle();  
		//Setting the properties of the rectangle 
		r .setX(x); 
		r .setY(y); 
		r.setEffect(nodeShadow);

		r.setWidth(50); 
		r.setHeight(10);
		r.setFill(Color.web("#44d9ff"));


		StackPane pane2=new StackPane();
		txtR.setX(x);
		txtR.setY(y);
		txtR.setFill(Color.BLACK);
		pane2.getChildren().addAll(r,txtR);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
