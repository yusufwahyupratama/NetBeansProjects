import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DzikirCounter extends JFrame {
    private int count = 0; // Variabel untuk menghitung dzikir
    private JLabel countLabel; // Label untuk menampilkan hitungan
    private JButton countButton, resetButton, saveButton, deleteButton; // Tombol untuk menghitung, mereset, menyimpan, dan menghapus
    private DefaultListModel<String> countListModel; // Model untuk daftar hitungan
    private JList<String> countList; // Komponen untuk menampilkan daftar hitungan

    public DzikirCounter() {
        // Mengatur judul dan ukuran jendela
        setTitle("Dzikir Counter");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Membuat label untuk menampilkan hitungan
        countLabel = new JLabel("Hitungan: 0", SwingConstants.CENTER);
        countLabel.setFont(new Font("Arial", Font.BOLD, 30));

        // Membuat tombol Count dengan warna biru
        countButton = createCircleButton("Count", Color.BLUE);
        countButton.addActionListener(e -> incrementCounter());

        // Membuat tombol Reset dengan warna merah
        resetButton = createCircleButton("Reset", Color.RED);
        resetButton.addActionListener(e -> resetCounter());

        // Membuat tombol Save dengan warna hijau
        saveButton = createCircleButton("Save", Color.GREEN);
        saveButton.addActionListener(e -> saveCount());

        // Membuat panel untuk tombol
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(countButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(saveButton);

        // Model dan JList untuk menampilkan daftar hitungan yang disimpan
        countListModel = new DefaultListModel<>();
        countList = new JList<>(countListModel);

        // Membuat tombol Delete dengan warna oranye
        deleteButton = new JButton("Delete Selected");
        deleteButton.addActionListener(e -> deleteSelectedCount());

        // Membuat panel untuk tombol delete dan list
        JPanel deletePanel = new JPanel(new BorderLayout());
        deletePanel.add(deleteButton, BorderLayout.NORTH); // Tombol delete berada di atas
        JScrollPane listScrollPane = new JScrollPane(countList);
        listScrollPane.setPreferredSize(new Dimension(200, 100));
        deletePanel.add(listScrollPane, BorderLayout.CENTER); // Daftar berada di bawah tombol delete

        // Menambahkan label, panel tombol, dan panel delete ke dalam frame
        add(countLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(deletePanel, BorderLayout.SOUTH);

        // Menambahkan event listener untuk tombol spasi dan delete pada keyboard
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    incrementCounter(); // Tambah hitungan jika spasi ditekan
                } else if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    resetCounter(); // Reset hitungan jika delete ditekan
                }
            }
        });

        // Membuat frame fokus pada input keyboard
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        requestFocusInWindow(); // Memastikan frame meminta fokus saat dibuka
    }

    // Method untuk menambah hitungan dan memperbarui tampilan
    private void incrementCounter() {
        count++;
        if (count >= 100) {
            count = 0; // Reset hitungan jika mencapai 100
        }
        countLabel.setText("Hitungan: " + count);
    }

    // Method untuk mereset hitungan
    private void resetCounter() {
        count = 0;
        countLabel.setText("Hitungan: " + count);
    }

    // Method untuk menyimpan hitungan dengan nama sesuai keinginan pengguna
    private void saveCount() {
        String nama = JOptionPane.showInputDialog(this, "Masukkan nama atau keterangan:");
        if (nama != null && !nama.trim().isEmpty()) {
            countListModel.addElement(nama + ": " + count);
            resetCounter(); // Reset hitungan setelah menyimpan
        } else {
            JOptionPane.showMessageDialog(this, "Nama atau keterangan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method untuk menghapus hitungan yang dipilih dari daftar
    private void deleteSelectedCount() {
        int selectedIndex = countList.getSelectedIndex(); // Mendapatkan indeks yang dipilih
        if (selectedIndex != -1) {
            countListModel.remove(selectedIndex); // Menghapus item yang dipilih dari model
        } else {
            JOptionPane.showMessageDialog(this, "Tidak ada item yang dipilih untuk dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method untuk membuat tombol berbentuk lingkaran dengan warna tertentu
    private JButton createCircleButton(String text, Color color) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                if (getModel().isArmed()) {
                    g.setColor(color.darker());
                } else {
                    g.setColor(color);
                }
                g.fillOval(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }

            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(color.darker());
                g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(100, 100); // Ukuran tombol
            }
        };

        // Set properties to make the button circular and transparent
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.setForeground(Color.WHITE);
        button.setHorizontalTextPosition(SwingConstants.CENTER);

        return button;
    }

    public static void main(String[] args) {
        // Menjalankan aplikasi
        SwingUtilities.invokeLater(() -> {
            DzikirCounter counter = new DzikirCounter();
            counter.setVisible(true);
        });
    }
}
