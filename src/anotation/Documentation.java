package anotation;

//import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//import javax.swing.text.Document;



//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Docs.class)
public @interface Documentation {
  String author ();
  String  date ();
  int version() default 1;
  
  String [] responsable(); 
  
	
}
