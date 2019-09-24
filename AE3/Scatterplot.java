import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Scatterplot extends JPanel{

	Double x, y;
	Ellipse2D.Double ellipse = new Ellipse2D.Double();

	Graphics g;

	DecimalFormat df = new DecimalFormat("0.0");// set number of digits after decimal point
	public static int xdrawMethod = 0;
	public static int ydrawMethod = 0;

	int bw = 600; // set box width
	int bh = 600; // set box height

	int gap = 50;// box gap with(0,0)

	//// set end point of width and height
	int ew = gap + bw;
	int eh = gap + bh;

	int kw; // set the width gap
	int kh; // set the height gapß
	int tl = 5; // set tick marks length
	int tn = 5;// set the number of tick marks

	// draw tick marks of x Axis
	public void drawxAxis(Double max, Double min, Graphics g) {
		int k = gap;
		Double mark = min;
		for (int i = 0; i < tn + 1; i++) {
			// draw x tick marks
			String tick = String.valueOf(df.format(mark));
			g.setColor(Color.black);
			// 20 mean the distance between string and xAxis
			g.drawString(tick, k, eh + 20);
			mark = mark + (max - min) / tn;
			k = k + bw / tn;
		}
	}

	// draw tick marks of y Axis
	public void drawyAxis(Double max, Double min, Graphics2D g) {
		int k = gap + bh;
		Double mark = min;
		for (int i = 0; i < tn + 1; i++) {
			// draw x tick marks
			String tick = String.valueOf(df.format(mark));
			g.setColor(Color.black);
			g.drawString(tick, 0, k);
			mark = mark + (max - min) / tn;
			k = k - bh / tn;
		}
	}

	// the method of getting the ordinate and drawing points
	public void drawpoint(Double xmax, Double xmin, Double ymax, Double ymin, ArrayList<Double> x1,
			ArrayList<Double> y1, Graphics2D g1) {
		for (int i = 0; i < x1.size(); i++) {
			x = gap + bw * (((x1.get(i) - xmin)) / (xmax - xmin));
			y = (gap + bh) - bh * (((y1.get(i) - ymin)) / (ymax - ymin));
			BondTrade.m.set(i, x);
			BondTrade.n.set(i, y);
			ellipse = new Ellipse2D.Double(x - 4, y - 4, 8, 8);
			g1.setColor(Color.blue);
			g1.fill(ellipse);
		}
	}

	public void paintComponent(Graphics g) {

		g.setColor(Color.black);// set color

		// draw the scatterplot box
		Graphics2D g2 = (Graphics2D) g;

		Rectangle box = new Rectangle(gap, gap, bw, bh);
		g2.draw(box);

		// add name of Axis
		g2.drawString("x", ew + tl, eh);
		g2.drawString("y", gap, gap - tl);

		kw = gap + bw / tn;
		kh = gap + bh / tn;
		// draw xAxis and tick marks
		// draw yAxis and tick marks
		for (int i = 0; i < tn - 1; i++) {
			// add x tick marks
			g2.drawLine(gap, kh, gap - tl, kh);
			// add y tick marks
			g2.drawLine(kw, eh, kw, eh + tl);
			kw += bw / tn;
			kh += bh / tn;
		}
		// ==========================================================x,y combo box
		// x = YIELD
		if (BondTrade.file = true) {
			if (xdrawMethod == 1) {
				drawxAxis(BondTrade.amax, BondTrade.amin, g2);
				// y = YIELD
				if (ydrawMethod == 1) {
					drawyAxis(BondTrade.amax, BondTrade.amin, g2);
					drawpoint(BondTrade.amax, BondTrade.amin, BondTrade.amax, BondTrade.amin, BondTrade.a, BondTrade.a,
							g2);
				}
				// y = DAYS_TO_MATURITY
				if (ydrawMethod == 2) {
					drawyAxis(BondTrade.bmax, BondTrade.bmin, g2);
					drawpoint(BondTrade.amax, BondTrade.amin, BondTrade.bmax, BondTrade.bmin, BondTrade.a, BondTrade.b,
							g2);
				}
				// y = AMOUNT_CHF(000)
				if (ydrawMethod == 3) {
					drawyAxis(BondTrade.cmax, BondTrade.cmin, g2);
					drawpoint(BondTrade.amax, BondTrade.amin, BondTrade.cmax, BondTrade.cmin, BondTrade.a, BondTrade.c,
							g2);
				}
			}
			// x = DAYS_TO_MATURITY
			if (xdrawMethod == 2) {
				drawxAxis(BondTrade.bmax, BondTrade.bmin, g2);
				// y = YIELD
				if (ydrawMethod == 1) {
					drawyAxis(BondTrade.amax, BondTrade.amin, g2);
					drawpoint(BondTrade.bmax, BondTrade.bmin, BondTrade.amax, BondTrade.amin, BondTrade.b, BondTrade.a,
							g2);
				}
				// y = DAYS_TO_MATURITY
				if (ydrawMethod == 2) {
					drawyAxis(BondTrade.bmax, BondTrade.bmin, g2);
					drawpoint(BondTrade.bmax, BondTrade.bmin, BondTrade.bmax, BondTrade.bmin, BondTrade.b, BondTrade.b,
							g2);
				}
				// y = AMOUNT_CHF(000)
				if (ydrawMethod == 3) {
					drawyAxis(BondTrade.cmax, BondTrade.cmin, g2);
					drawpoint(BondTrade.bmax, BondTrade.bmin, BondTrade.cmax, BondTrade.cmin, BondTrade.b, BondTrade.c,
							g2);
				}
			}
			// x = AMOUNT_CHF(000)
			if (xdrawMethod == 3) {
				drawxAxis(BondTrade.cmax, BondTrade.cmin, g2);
				// y = YIELD
				if (ydrawMethod == 1) {
					drawyAxis(BondTrade.amax, BondTrade.cmin, g2);
					drawpoint(BondTrade.cmax, BondTrade.cmin, BondTrade.amax, BondTrade.amin, BondTrade.c, BondTrade.a,
							g2);
				}
				// y = DAYS_TO_MATURITY
				if (ydrawMethod == 2) {
					drawyAxis(BondTrade.bmax, BondTrade.bmin, g2);
					drawpoint(BondTrade.cmax, BondTrade.cmin, BondTrade.bmax, BondTrade.bmin, BondTrade.c, BondTrade.b,
							g2);
				}
				// y = AMOUNT_CHF(000)
				if (ydrawMethod == 3) {
					drawyAxis(BondTrade.cmax, BondTrade.cmin, g2);
					drawpoint(BondTrade.cmax, BondTrade.cmin, BondTrade.cmax, BondTrade.cmin, BondTrade.c, BondTrade.c,
							g2);
				}
			}
		}

	}

}
