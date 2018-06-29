package Lista09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Logan Michel
 */
public class Ex03L09 {
    private JFrame jFrame;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JLabel jLabelTabuada;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada;
    private JButton jButtonGerarTabuada;
    
    public Ex03L09(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoGerarTabuada();
        configurarJScrolPane();
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
        jFrame.add(jLabelTabuada);
        jFrame.add(jScrollPaneTabuada);
        jFrame.add(jButtonGerarTabuada);
        jFrame.add(jTextAreaTabuada);
    }

    private void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jLabelTabuada = new JLabel("Tabuada");
        jTextAreaTabuada = new JTextArea();
        jScrollPaneTabuada = new JScrollPane();
        jButtonGerarTabuada = new JButton("Gerar Tabuada");
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
    }

    private void gerarDimensoes() {
        jLabelNumero.setSize(50, 20);
        jTextFieldNumero.setSize(50, 20);
        jLabelTabuada.setSize(50, 20);
        jButtonGerarTabuada.setSize(200, 40);
        jScrollPaneTabuada.setSize(470, 385);
        
    }

    private void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 5);
        jTextFieldNumero.setLocation(10, 30);
        jLabelTabuada.setLocation(10, 50);
        jButtonGerarTabuada.setLocation(150, 15);
        jScrollPaneTabuada.setLocation(10, 70);
    }

    private void acaoGerarTabuada() {
        jButtonGerarTabuada.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextFieldNumero.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Você prescisa digitar um Valor.");
                    jTextFieldNumero.requestFocus();
                    return;
                }
                int numero = 0;
                try {
                    numero = Integer.parseInt(
                        jTextFieldNumero.getText().trim());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "O campo deve conter somentes Números");
                    jTextFieldNumero.requestFocus();
                    return;
                }
            }
        });
        
    }

    private void configurarJScrolPane() {
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(
                jScrollPaneTabuada.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(
                jScrollPaneTabuada.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setLineWrap(true);
    }

    
}
