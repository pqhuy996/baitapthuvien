import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuanLyThuVien extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("QuanLyThuVien");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        ThuVien thuVien = new ThuVien(1, "Thư Viện VKU");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel tieuDeLabel = new JLabel("Tiêu đề:");
        JTextField tieuDeField = new JTextField(20);
        JLabel tacGiaLabel = new JLabel("Tác giả:");
        JTextField tacGiaField = new JTextField(20);
        JLabel theLoaiLabel = new JLabel("Thể loại:");
        JTextField theLoaiField = new JTextField(20);
        JLabel namXuatBanLabel = new JLabel("Năm xuất bản:");
        JTextField namXuatBanField = new JTextField(5);
        JLabel trangThaiLabel = new JLabel("Trạng thái:");
        JTextField trangThaiField = new JTextField(10);
        JButton themButton = new JButton("Thêm sách");
        themButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = thuVien.getDanhSachSach().size() + 1;
                Sach sach = new Sach(id, tieuDeField.getText(), tacGiaField.getText(), theLoaiField.getText(), Integer.parseInt(namXuatBanField.getText()), trangThaiField.getText());
                thuVien.themSachMoi(sach);
                JOptionPane.showMessageDialog(frame, "Đã thêm sách");
            }
        });
        JButton LietKeButton = new JButton("Liệt kê sách");
        LietKeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder danhSachSach = new StringBuilder();
                for (Sach sach : thuVien.getDanhSachSach()) {
                    danhSachSach.append(sach.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(frame, danhSachSach.toString());
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2));
        inputPanel.add(tieuDeLabel);
        inputPanel.add(tieuDeField);
        inputPanel.add(tacGiaLabel);
        inputPanel.add(tacGiaField);
        inputPanel.add(theLoaiLabel);
        inputPanel.add(theLoaiField);
        inputPanel.add(namXuatBanLabel);
        inputPanel.add(namXuatBanField);
        inputPanel.add(trangThaiLabel);
        inputPanel.add(trangThaiField);
        inputPanel.add(new JLabel());
        inputPanel.add(themButton);
        panel.add(inputPanel, BorderLayout.NORTH);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
