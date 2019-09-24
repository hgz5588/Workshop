import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Layout implements ActionListener, MouseListener {

	int w = 700; // set pane width
	int h = 700; // set pane height

	BondTrade bt = new BondTrade();// call the class of BondTrade
	JFrame frame = new JFrame();// Create main pane
	// ======================================= declare and instantiate components
	JPanel panel1 = new JPanel();
	Scatterplot panel2 = new Scatterplot();
	JPanel panel3 = new JPanel();

	JButton button_open = new JButton("Open");
	JButton button_quit = new JButton("Quit");

	JLabel name_of_file = new JLabel("name_of_file");
	JTextArea detail_of_a_selected_trade = new JTextArea("detail_of_a_selected_trade");
	// set combo boxes
	String[] x = { "YIELD", "DAYS_TO_MATURITY", "MOUNT_CHF(000)" };
	String[] y = { "YIELD", "DAYS_TO_MATURITY", "AMOUNT_CHF(000)" };
	JComboBox xAxis = new JComboBox(x);
	JComboBox yAxis = new JComboBox(y);

	// ====================================================================== Layout
	public void go() {
		frame.add(panel1, BorderLayout.PAGE_START);

		// Make the center component big, since that's the
		// typical usage of BorderLayout.

		panel2.setPreferredSize(new Dimension(w, h));

		frame.add(panel2, BorderLayout.CENTER);

		frame.add(panel3, BorderLayout.PAGE_END);

		// set first panel
		panel1.add(button_open);
		panel1.add(name_of_file);
		panel1.add(button_quit);

		// set third panel
		JLabel xlabel = new JLabel("x");
		JLabel ylabel = new JLabel("y");
		panel3.add(xlabel);
		panel3.add(xAxis);
		panel3.add(ylabel);
		panel3.add(yAxis);
		yAxis.setSelectedItem("DAYS_TO_MATURITY");// set default value
		panel3.add(detail_of_a_selected_trade);
		// monitor events
		button_open.addActionListener(this);
		button_quit.addActionListener(this);
		xAxis.addActionListener(this);
		yAxis.addActionListener(this);
		panel2.addMouseListener(this);
		// set frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("AE3");
		frame.setSize(300, 300);
		frame.setLocation(100, 100);
		frame.pack();
		frame.setVisible(true);

	}

	// ================================================================== event
	public void actionPerformed(ActionEvent e) {
		// open event
		if (e.getSource() == button_open) {
			// initialise Arraylist
			BondTrade.a = new ArrayList<Double>();
			BondTrade.b = new ArrayList<Double>();
			BondTrade.c = new ArrayList<Double>();

			BondTrade.m = new ArrayList<Double>();
			BondTrade.n = new ArrayList<Double>();
			// react filechoose method
			try {
				bt.filechoose();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			name_of_file.setText(bt.filename);
			panel2.repaint();
		}

		// close event
		if (e.getSource() == button_quit)
			System.exit(0);
		// x and y axes event
		if (xAxis.getSelectedItem() == x[0]) {
			panel2.xdrawMethod = 1;
			panel2.repaint();

		}
		;
		if (xAxis.getSelectedItem() == x[1]) {
			panel2.xdrawMethod = 2;
			panel2.repaint();

		}
		;
		if (xAxis.getSelectedItem() == x[2]) {
			panel2.xdrawMethod = 3;
			panel2.repaint();

		}
		;
		if (yAxis.getSelectedItem() == y[0]) {
			panel2.ydrawMethod = 1;
			panel2.repaint();

		}
		;
		if (yAxis.getSelectedItem() == y[1]) {
			panel2.ydrawMethod = 2;
			panel2.repaint();

		}
		;
		if (yAxis.getSelectedItem() == y[2]) {
			panel2.ydrawMethod = 3;
			panel2.repaint();

		}
		;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		for (int i = 0; i < BondTrade.a.size(); i++) {

			if (e.getX() >= (BondTrade.m.get(i) - 4) && e.getX() <= (BondTrade.m.get(i) + 4)
					&& e.getY() >= (BondTrade.n.get(i) - 4) && e.getY() <= (BondTrade.n.get(i) + 4)) {
				detail_of_a_selected_trade.setText("YIELD: " + BondTrade.a.get(i) + "\n" + "DAYS_TO_MATURITY: "
						+ BondTrade.b.get(i) + "\n" + "AMOUNT_CHF(000): " + BondTrade.c.get(i));
				break;
			}
			// still thinking the follow code
			// e.getButton()==1&&Scatterplot.ellipse.contains(BondTrade.m.get(i),BondTrade.n.get(i),8,8)
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
