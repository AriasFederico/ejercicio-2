public class Main {
    public static void main(String[] args) {
        int numeroWhile = 0;
        int numeroIf = 2;
        int numeroFor = 0;
        var estacion = "invierno";

        if(numeroIf < 0){
            System.out.println("es negativo");
        }else if(numeroIf > 0){
            System.out.println("es positivo");
        }else{
            System.out.println("es 0");
        }

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);

        for (int i =0;i<3;i++){
            numeroFor++;
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "primavera":
                System.out.println("es primavera");
                break;
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("la variable no es una estacion");
        }

    }
}