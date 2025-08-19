// lidando com arrays
import java.util.ArrayList;
import java.util.List;

public class exercicio2Arrays {
    public static void main(String[] args) {

        String[] nomes = new String[5];
        String[] animais = {"Cachorro", "gato", "passaros"};
        Object[] arrayObjeto = {1, "oi", true};
        List<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add("Luis");
        arrayList.add(20.0);
        arrayList.add(true);

        System.out.println(nomes[0]);

        System.out.println("For normal do Java");
        for (int i = 0; i < animais.length; i++) {
            System.out.println(animais[i]);
        }

        // --------------------------------------------------

        System.out.println("Foreach do Java");
        for (Object objeto : animais) {
            System.out.println(objeto);
        }
        System.out.println(arrayList);
        for (Object objeto : arrayList) {
            System.out.println(objeto);
        }
        
        for (Object objeto : arrayObjeto) {
            System.out.println(objeto);
        }
        // --------------------------------------------------
        
        
    }
}
