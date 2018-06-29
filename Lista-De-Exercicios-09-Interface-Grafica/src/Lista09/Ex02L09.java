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
public class Ex02L09 {

    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;

    public Ex02L09() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoTabuada();
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
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
    }

    private void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Tabuada");
    }

    private void gerarDimensoes() {
        jLabelNumero.setSize(50, 20);
        jTextFieldNumero.setSize(50, 20);
        jButtonTabuada.setSize(100, 100);
    }

    private void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 5);
        jTextFieldNumero.setLocation(10, 30);
        jButtonTabuada.setLocation(10, 55);
    }

    private void acaoTabuada() {
        jButtonTabuada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextFieldNumero.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Um valor deve ser Preenchido!");
                    jTextFieldNumero.requestFocus();
                    return;
                }
                
                int numero = 0;
                try {
                    numero = Integer.parseInt(
                        jTextFieldNumero.getText().trim());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "O Valor deve conter somente Números!");
                    jTextFieldNumero.requestFocus();
                    return;
                }
                jTextFieldNumero.getText();
                int resultado = Integer.parseInt(jTextFieldNumero.getText());
                JOptionPane.showMessageDialog(null, resultado + " X " + "50 = " + resultado * 50);
            }
        });
    }

}
