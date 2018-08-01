# Bienvenue sur le test technique d'Atos!

# Sujet
@[Créer un FizzBuzz en vous basant sur les sources fournies.]({"stubs": ["src/main/java/net/atos/interview/FizzBuzzer.java", "src/test/java/net/atos/interview/FizzBuzzerTest.java"], "command": "net.atos.interview.FizzBuzzerTest#should_work_for_all_cases"})
package net.atos.interview;

public class FizzBuzzer {
String[]x = null;
public String[] generateFizzBuzzes(int to) {
x=new String[to];
for(int i=0;i<to;i++){
int n = (i+1);
if(!(n % 3 == 0 || n % 5 == 0)){
x[i] = n+"";
}else if(n%3 == 0 && n%5==0){
x[i] ="fizzbuzz";
}else{
if(n % 3 == 0 ){
x[i] ="fizz";
}else if(n % 5 == 0){
x[i]= "buzz";
}}

}
return x;
}
}
