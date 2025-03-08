package stopwatch_lap_tracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private long startTime = 0;
    private long elapsedTimeBeforePause = 0;  // Waktu yang sudah terhitung sebelum di-pause
    private Timer timer;
    private boolean running = false;
    private JButton startButton, resetButton, splitButton;
    private JLabel timeLabel, splitTimeLabel;
    private JTextArea splitArea;
    private int splitCount = 0;

    public Main() {
        // Pengaturan window utama
        setTitle("Stopwatch");
        setSize(600, 450);  // Ukuran window yang lebih besar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.DARK_GRAY);  // Latar belakang aplikasi jadi gelap untuk kesan modern

        // Label untuk stopwatch utama
        timeLabel = new JLabel("00:00:00.000", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 50));  // Font lebih besar dan tebal
        timeLabel.setForeground(Color.WHITE);  // Warna teks putih agar kontras dengan latar belakang
        timeLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));  // Tambahkan padding untuk ruang di sekitar teks
        add(timeLabel, BorderLayout.NORTH);

        // Label untuk split waktu
        splitTimeLabel = new JLabel("00:00:00.000", JLabel.CENTER);
        splitTimeLabel.setFont(new Font("Arial", Font.PLAIN, 25));  // Font yang lebih kecil untuk split
        splitTimeLabel.setForeground(Color.ORANGE);  // Warna teks oranye agar mencolok
        splitTimeLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));  // Padding di sekitarnya
        add(splitTimeLabel, BorderLayout.CENTER);

        // Panel untuk tombol dengan desain lebih menarik
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.DARK_GRAY);  // Sesuaikan warna latar panel dengan background aplikasi
        startButton = createStyledButton("Start", Color.GREEN);
        splitButton = createStyledButton("Split", Color.YELLOW);
        resetButton = createStyledButton("Reset", Color.RED);
        splitButton.setEnabled(false);  // Tombol split dinonaktifkan pada awal
        buttonPanel.add(startButton);
        buttonPanel.add(splitButton);
        buttonPanel.add(resetButton);
        add(buttonPanel, BorderLayout.SOUTH);  // Letakkan di bagian bawah

        // Area teks untuk split
        splitArea = new JTextArea();
        splitArea.setEditable(false);
        splitArea.setFont(new Font("Arial", Font.PLAIN, 14));
        splitArea.setBackground(Color.LIGHT_GRAY);  // Warna background area split menjadi abu-abu terang
        splitArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));  // Tambahkan garis pinggir
        add(new JScrollPane(splitArea), BorderLayout.EAST);  // Scroll untuk melihat split yang panjang

        // Timer logic
        timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long elapsedTime = System.currentTimeMillis() - startTime + elapsedTimeBeforePause;
                timeLabel.setText(formatTime(elapsedTime));
            }
        });

        // Start button logic
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!running) {
                    startTime = System.currentTimeMillis();
                    timer.start();
                    startButton.setText("Pause");
                    splitButton.setEnabled(true);
                    running = true;
                } else {
                    elapsedTimeBeforePause += System.currentTimeMillis() - startTime;  // Simpan waktu sebelum pause
                    timer.stop();
                    startButton.setText("Start");
                    running = false;
                }
            }
        });

        // Split button logic
        splitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long elapsedTime = elapsedTimeBeforePause + (running ? System.currentTimeMillis() - startTime : 0);
                splitCount++;
                splitArea.append("#" + splitCount + " Split: " + formatTime(elapsedTime) + "\n");
                splitTimeLabel.setText(formatTime(elapsedTime));
            }
        });

        // Reset button logic
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
                running = false;
                startTime = 0;
                elapsedTimeBeforePause = 0;  // Reset waktu terhitung sebelumnya
                timeLabel.setText("00:00:00.000");
                splitTimeLabel.setText("00:00:00.000");
                splitArea.setText("");
                startButton.setText("Start");
                splitButton.setEnabled(false);
                splitCount = 0;
            }
        });
    }

    // Fungsi untuk membuat tombol dengan gaya khusus
    private JButton createStyledButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16));  // Font tebal agar tombol terlihat jelas
        button.setBackground(color);  // Warna latar tombol sesuai parameter
        button.setForeground(Color.BLACK);  // Warna teks tombol hitam
        button.setFocusPainted(false);  // Menghilangkan garis fokus pada tombol
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));  // Tambahkan border putih tebal
        button.setPreferredSize(new Dimension(100, 40));  // Ukuran tombol lebih besar
        return button;
    }

    // Format waktu menjadi hh:mm:ss.SSS
    private String formatTime(long millis) {
        long hours = millis / 3600000;
        long minutes = (millis % 3600000) / 60000;
        long seconds = (millis % 60000) / 1000;
        long milliseconds = millis % 1000;
        return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds);
    }

    // Main method untuk menjalankan aplikasi
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);  // Jalankan stopwatch dengan tampilan yang diperbarui
            }
        });
    }
}
