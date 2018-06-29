package Lista09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Logan Michel
 */
public class Ex04L09 {
    
    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonVerificar;
    
    public Ex04L09(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoVerificar();
        //configurarJScrolPane();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    private void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonVerificar= new JButton("Verificar");
    }

    private void gerarDimensoes() {
        jLabelNumero.setSize(50, 20);
        jTextFieldNumero.setSize(50, 20);
        jButtonVerificar.setSize(100, 50);
    }
    
    private void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 40);
        jButtonVerificar.setLocation(200, 20);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonVerificar);
    }

    private void acaoVerificar() {
        jButtonVerificar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    
}
