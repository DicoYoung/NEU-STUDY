package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TextGui {

	public static void main(String[] args) {
        // ������
        JFrame f = new JFrame("�׵۽��쵱��������");
 
        // ���������ô�С
        f.setSize(800, 600);
 
        // ����������λ��
        f.setLocation(200, 200);
 
        // �������е��������Ϊ���Զ�λ
        f.setLayout(null);
 
        // ��ť���
        JButton b = new JButton("Always");
 
        // ͬʱ��������Ĵ�С��λ��
        b.setBounds(200, 200, 200, 200);
 
        // �Ѱ�ť���뵽��������
        f.add(b);
 
        // �رմ����ʱ���˳�����
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // �ô����ÿɼ�
        f.setVisible(true);
 
    }

}
