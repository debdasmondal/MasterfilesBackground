import com.ubs.mf.controller.MyBean
import com.ubs.mf.controller.MyTestClass

class Example {
   static int calcSum(var) {
      int c = var.var1 + var.var2;
      
      def var11 = new MyBean();
      var11.var1 = 34
      var11.var2 = 14
      
      def myTestClass = new MyTestClass()
      
      println(myTestClass.sub(var11));
      println(c);
      return c;
      
   }  
	
   static void main(String[] args) {
      sum(10,5);
   } 
}