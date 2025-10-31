package school.serverprogram;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

class ClientUI extends JFrame {
    JTextField jf;

    class MyUILister implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //TCP/IP network 통신
            //Client 파트 종이컵 생선
            try {
            Socket client = new Socket("210.101.236.171",8888);
            //쓰기 위한 실 뽑아내기
            OutputStream os = client.getOutputStream();
            String msg = jf.getText();
            os.write(msg.getBytes());
            jf.setText("");
            }catch (Exception ignore){
                System.out.println("문제발생");
            }
        }
    }


    public ClientUI(){
        jf = new JTextField(15);
        this.add(jf);
        MyUILister m = new MyUILister();
        jf.addActionListener(m);

        setSize(300, 100);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}


public class Client {
    public static void main(String[] args) throws UnknownHostException,IOException {
        new ClientUI();

    }
}



