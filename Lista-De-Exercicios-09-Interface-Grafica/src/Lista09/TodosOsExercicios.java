package Lista09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Logan Michel
 */
public class TodosOsExercicios {
    
    private JFrame jFrame;
    private JButton jButton00;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    
    public TodosOsExercicios(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButton00();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
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
        jFrame.add(jButton00);
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
    }

    private void instanciarComponentes() {
        jButton00 = new JButton("Exercicio 01");
        jButton01 = new JButton("Exercicio 02");
        jButton02 = new JButton("Exercicio 03");
        jButton03 = new JButton("Exercicio 04");
        jButton04 = new JButton("Exercicio 05");
        jButton05 = new JButton("Exercicio 06");
        jButton06 = new JButton("Exercicio 07");
        jButton07 = new JButton("Exercicio 08");
        jButton08 = new JButton("Exercicio 09");
    }
    
    private void gerarLocalizacoes() {
        jButton00.setLocation(10, 10);
        jButton01.setLocation(120, 10);
        jButton02.setLocation(230, 10);
        jButton03.setLocation(340, 10);
        jButton04.setLocation(10, 120);
        jButton05.setLocation(120, 120);
        jButton06.setLocation(230, 120);
        jButton07.setLocation(340, 120);
        jButton08.setLocation(10, 230);
    }

    private void gerarDimensoes() {
        jButton00.setSize(110, 100);
        jButton01.setSize(110, 100);
        jButton02.setSize(110, 100);
        jButton03.setSize(110, 100);
        jButton04.setSize(110, 100);
        jButton05.setSize(110, 100);
        jButton06.setSize(110, 100);
        jButton07.setSize(110, 100);
        jButton08.setSize(110, 100);
    }

    private void acaoJButton00() {
        jButton00.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Ex01L09();
            }
        });
    }

    private void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Ex02L09();
            }
        });
    }

    private void acaoJButton02() {
    }

    private void acaoJButton03() {
    }

    private void acaoJButton04() {
    }

    private void acaoJButton05() {
    }

    private void acaoJButton06() {
    }

    private void acaoJButton07() {
    }

    private void acaoJButton08() {
    }
    
}
