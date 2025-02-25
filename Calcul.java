public class Calcul()
{
    public ad (int a , int b){
        return a+b;
    }
    public sous (int a , int b){
        return a-b;
    }
    public mult (int a , int b){
        return a*b;
    }
    public divi (int a , int b){
        if (b==0){
            return"erreur";
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in )
        Calcul calc = new Calcul();
        System.out.println("entrer le premier nombre" );
        int a = scanner.nextInt();
        System.out.println("entrer la deuxieme nombre" );
        int b = scanner.nextInt();
        System.out.println("entrer operation " );
        int c=scanner.nextInt();
if (c==0){
    System.out.println("la somme est  " + calc.ad(a,b));
}
if (c==1){
    System.out.println("la sous est " - calc.sous(a,b));
}
if (c==2){
    System.out.println("la multi est " * calc.multi(a,b));
}
if (c==3){
    System.out.println("la divi est " / calc.divi(a,b));
}
        
       
       


        }

}