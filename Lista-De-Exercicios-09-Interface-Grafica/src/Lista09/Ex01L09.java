package Lista09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Logan Michel
 */
public class Ex01L09 {
    private JFrame jFrame;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcatenar;
    
    
    public  Ex01L09(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoConcatenar();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void adicionarComponentes() {
        
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobrenome);
        jFrame.add(jButtonConcatenar);
    }

    private void instanciarComponentes() {
        
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField();
        jButtonConcatenar = new JButton("Concatenar");
    }

    private void gerarDimensoes() {
        
        jLabelNome.setSize(100, 20);
        jTextFieldNome.setSize(150, 20);
        
        jLabelSobrenome.setSize(100, 20);
        jTextFieldSobrenome.setSize(150, 20);
        
        jButtonConcatenar.setSize(150, 50);
    }

    private void gerarLocalizacoes() {
        
        jLabelNome.setLocation(10, 5);
        jTextFieldNome.setLocation(10, 25);
        
        jLabelSobrenome.setLocation(10, 50);
        jTextFieldSobrenome.setLocation(10, 70);
        
        jButtonConcatenar.setLocation(10, 100);
    }
    
    private void acaoConcatenar(){
        jButtonConcatenar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jTextFieldNome.getText();
                String NomeCompleto = jTextFieldNome.getText() + " " + jTextFieldSobrenome.getText();
                JOptionPane.showMessageDialog(null, NomeCompleto);    
            }
        });
        
    }

    
}
