package util;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Format {

    public static String formatCNPJ(String cnpj) throws ParseException {
        MaskFormatter formataCNPJ = null;
        try {
            formataCNPJ = new MaskFormatter("##.###.###/####-##");
            formataCNPJ.setValueContainsLiteralCharacters(false);
            cnpj = formataCNPJ.valueToString(cnpj);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        return cnpj;
    }

    public static String formatCPF(String cpf) throws ParseException {
        MaskFormatter formataCPF = null;
        try {
            formataCPF = new MaskFormatter("###.###.###-##");
            formataCPF.setValueContainsLiteralCharacters(false);
            cpf = formataCPF.valueToString(cpf);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        return cpf;
    }



}
