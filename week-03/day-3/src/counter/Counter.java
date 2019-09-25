package counter;

public class Counter {
 int value;
 int reset;

 public Counter(){
   value=0;
   reset=0;
 }
 public Counter(int number){
   this.value=number;
   reset=number;
 }

 public void add(){
   value+=1;
 }
 public void add(int number){
   value+=number;
 }
 public int get(){
   return value;
 }
 public void reset(){
   value=reset;
 }
}
