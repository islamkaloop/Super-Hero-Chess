package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import exceptions.InvalidPowerUseException;
import exceptions.OccupiedCellException;
import exceptions.UnallowedMovementException;
import exceptions.WrongTurnException;
import model.game.Direction;
import model.game.Game;
import model.game.Player;
import model.pieces.Piece;
import model.pieces.heroes.ActivatablePowerHero;
import model.pieces.heroes.Armored;
import model.pieces.heroes.Medic;
import model.pieces.heroes.Ranged;
import model.pieces.heroes.Speedster;
import model.pieces.heroes.Super;
import model.pieces.heroes.Tech;
import model.pieces.sidekicks.SideKick;

public class TheGame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel fplayer, splayer;
	private JTextArea currentplayr, pieceinf;
	private JTextField fp1, fp2;
	private CardLayout card, card1, card2;
	private Container container, container1, container2;
	private JProgressBar fppb, sppb;
	private JLabel dff, thewiner;

	private JButton w, mb, pb;
	private int i = 0, j = 0, a11 = -15, a22 = -15, t = 0;;
	private JPanel a, b, c, d, e, f, y, a1, a2, a3, b1, b2;
	private Game h;
	Direction dw = null;
	Piece ff = null;
	Piece ff1 = null;
	Point l12 = null;
	boolean fds = false;
	boolean fds1 = false;

	// player labels
	JLabel backgroundImage1 = new JLabel(new ImageIcon(this.getClass().getResource("Deadpoolf.png")));
	JLabel backgroundImage2 = new JLabel(new ImageIcon(this.getClass().getResource("captenf.png")));
	JLabel backgroundImage3 = new JLabel(new ImageIcon(this.getClass().getResource("greenlantenrf.png")));
	JLabel backgroundImage4 = new JLabel(new ImageIcon(this.getClass().getResource("visionf.png")));
	JLabel backgroundImage5 = new JLabel(new ImageIcon(this.getClass().getResource("greenarrowf.png")));
	JLabel backgroundImage6 = new JLabel(new ImageIcon(this.getClass().getResource("hawk eyef.png")));
	JLabel backgroundImage7 = new JLabel(new ImageIcon(this.getClass().getResource("flashf.png")));
	JLabel backgroundImage8 = new JLabel(new ImageIcon(this.getClass().getResource("quickselverf.png")));
	JLabel backgroundImage9 = new JLabel(new ImageIcon(this.getClass().getResource("supermanf.png")));
	JLabel backgroundImage10 = new JLabel(new ImageIcon(this.getClass().getResource("hulkf.png")));
	JLabel backgroundImage11 = new JLabel(new ImageIcon(this.getClass().getResource("batmanf.png")));
	JLabel backgroundImage12 = new JLabel(new ImageIcon(this.getClass().getResource("iron manf.png")));
	JLabel backgroundImage13 = new JLabel(new ImageIcon(this.getClass().getResource("sidek1f.png")));
	JLabel backgroundImage14 = new JLabel(new ImageIcon(this.getClass().getResource("sidek1f.png")));
	JLabel backgroundImage15 = new JLabel(new ImageIcon(this.getClass().getResource("sidek1f.png")));
	JLabel backgroundImage16 = new JLabel(new ImageIcon(this.getClass().getResource("sidek1f.png")));
	JLabel backgroundImage17 = new JLabel(new ImageIcon(this.getClass().getResource("sidek1f.png")));
	JLabel backgroundImage18 = new JLabel(new ImageIcon(this.getClass().getResource("sidek1f.png")));
	JLabel backgroundImage19 = new JLabel(new ImageIcon(this.getClass().getResource("sidek2f.png")));
	JLabel backgroundImage20 = new JLabel(new ImageIcon(this.getClass().getResource("sidek2f.png")));
	JLabel backgroundImage21 = new JLabel(new ImageIcon(this.getClass().getResource("sidek2f.png")));
	JLabel backgroundImage22 = new JLabel(new ImageIcon(this.getClass().getResource("sidek2f.png")));
	JLabel backgroundImage23 = new JLabel(new ImageIcon(this.getClass().getResource("sidek2f.png")));
	JLabel backgroundImage24 = new JLabel(new ImageIcon(this.getClass().getResource("sidek2f.png")));
	handler ut = new handler();
	hand1234 ut1 = new hand1234();
	// player
	Icon q11 = new ImageIcon(this.getClass().getResource("24.png"));
	Icon q12 = new ImageIcon(this.getClass().getResource("1.jpg"));
	Icon q13 = new ImageIcon(this.getClass().getResource("25.png"));
	Icon q14 = new ImageIcon(this.getClass().getResource("23.png"));
	Icon q15 = new ImageIcon(this.getClass().getResource("26.png"));


	private JLabel[][] board = new JLabel[7][6];
	private JButton[][] board1 = new JButton[7][6];

	handella f12 = new handella();

	public void dfdf() {
		for (int i1 = 0; i1 < 7; i1++) {
			for (int j1 = 0; j1 < 6; j1++) {
				JButton sd = new JButton(new ImageIcon(this.getClass().getResource("1.jpg")));
				sd.setLayout(null);
				sd.setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
				board1[i1][j1] = sd;

			}
		}
	}

	public TheGame() {
		super("SuperHeroChees");
		// start
		a1 = new JPanel();
		a1.setBounds(new Rectangle(800, 100));
		a1.setLayout(new BorderLayout());

		fplayer = new JLabel("First Player :");
		splayer = new JLabel("Second Player :");
		fp1 = new JTextField(25);
		fp2 = new JTextField(25);
		w = new JButton("Start The Game");

		fplayer.setBounds(280, 450, 120, 20);
		splayer.setBounds(280, 490, 150, 20);
		fp1.setBounds(440, 450, 150, 20);
		fp2.setBounds(440, 490, 150, 20);
		w.setBounds(350, 530, 150, 25);

		fplayer.setForeground(Color.red);
		splayer.setForeground(Color.RED);

		fplayer.setFont(new Font("Arial", Font.PLAIN, 18));
		splayer.setFont(new Font("Arial", Font.PLAIN, 18));

		JLabel backgroundImage = new JLabel(new ImageIcon(this.getClass().getResource("7.jpg")));
		backgroundImage.setBounds(0, 0, 800, 700);

		w.setBorder(BorderFactory.createLineBorder(Color.gray, 1, true));

		a1.add(fplayer);
		a1.add(splayer);
		a1.add(fp1);
		a1.add(fp2);
		a1.add(w);
		a1.add(backgroundImage);

		handler1 x1 = new handler1();
		w.addActionListener(x1);
		// the game
		a2 = new JPanel();
		a2.setBounds(new Rectangle(800, 700));
		a2.setLayout(null);
		a = new JPanel();
		a.setBounds(0, 0, 135, 580);
		a2.add(a);
		b = new JPanel();
		b.setBackground(Color.GRAY);
		b.setBounds(0, 580, 135, 100);
		a2.add(b);
		c = new JPanel();
		c.setBounds(150, 0, 500, 680);
		c.setLayout(new GridLayout(7, 6));
		a2.add(c);
		d = new JPanel();
		d.setBounds(665, 0, 135, 380);
		d.setBackground(Color.white);
		a2.add(d);
		e = new JPanel();
		e.setBounds(665, 380, 135, 300);
		a2.add(e);
		f = new JPanel();
		f.setBounds(135, 0, 15, 680);
		a2.add(f);
		y = new JPanel();
		y.setBounds(650, 0, 15, 680);
		a2.add(y);

		a.addMouseListener(ut1);
		b.addMouseListener(ut1);
		d.addMouseListener(ut1);
		e.addMouseListener(ut1);
		f.addMouseListener(ut1);
		y.addMouseListener(ut1);

		a.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
		b.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
		c.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
		d.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
		e.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
		f.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
		y.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));

		// The end
		a3 = new JPanel();
		a3.setBounds(new Rectangle(800, 100));
		a3.setLayout(new BorderLayout());
		a3.setBorder(BorderFactory.createLineBorder(Color.gray, 1, true));

		JLabel backgroundImage1 = new JLabel(new ImageIcon(this.getClass().getResource("7.jpg")));
		JButton PlayA = new JButton("Play Again");
		JButton Exit = new JButton("Exit");
		thewiner = new JLabel();

		backgroundImage1.setBounds(0, 0, 800, 700);
		PlayA.setBounds(255, 550, 150, 30);
		Exit.setBounds(425, 550, 150, 30);
		thewiner.setBounds(270, 420, 350, 150);

		thewiner.setEnabled(true);
		thewiner.setFont(new Font("Arial", Font.PLAIN, 24));
		thewiner.setForeground(Color.RED);

		handplaya playag = new handplaya();
		handleexit gameexit = new handleexit();

		PlayA.addActionListener(playag);
		Exit.addActionListener(gameexit);

		a3.add(PlayA);
		a3.add(Exit);
		a3.add(thewiner);
		a3.add(backgroundImage1);

		//

		card = new CardLayout();
		container = getContentPane();
		container.setLayout(card);

		add(a1);
		add(a2);
		add(a3);
		

		container.getLayout().addLayoutComponent("startgame", a1);
		container.getLayout().addLayoutComponent("gamePage", a2);
		container.getLayout().addLayoutComponent("gameover", a3);

		b1 = new JPanel(new GridLayout(6, 2));
		b2 = new JPanel(new GridLayout(6, 2));

		card2 = new CardLayout();
		container2 = a;
		container2.setLayout(card2);
		a.add(b2);
		a.add(b1);
		container2.getLayout().addLayoutComponent("by2", b2);
		container2.getLayout().addLayoutComponent("by1", b1);

		dothat();
	}

	private class handleexit implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}

	}

	private class handplaya implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e4) {
			dispose();
		    TheGame x = new TheGame();
			x.setDefaultCloseOperation(EXIT_ON_CLOSE);
			x.setSize(820, 720);
			x.setVisible(true);
			x.setLocationRelativeTo(null);
			x.setAutoRequestFocus(true);
			x.setResizable(false);
			
		}

	}

	private class handler1 implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == w) {
				String fP1 = fp1.getText();
				String fP2 = fp2.getText();
				Player FP1 = new Player(fP1);
				Player FP2 = new Player(fP2);
				h = new Game(FP1, FP2);
				JLabel currentplayr1 = new JLabel("Current Player :");
				currentplayr1.setFont(new Font("Arial", Font.PLAIN, 18));
				currentplayr1.setForeground(Color.red);
				b.add(currentplayr1);
				currentplayr = new JTextArea(h.getCurrentPlayer().getName());
				currentplayr.setFont(new Font("Arial", Font.PLAIN, 18));
				currentplayr.setForeground(Color.red);
				currentplayr.setBackground(Color.GRAY);
				currentplayr.setLineWrap(true);
				currentplayr.setEnabled(false);
				b.add(currentplayr);
				f.setLayout(null);
				fppb = new JProgressBar(SwingConstants.VERTICAL, 0, 6);
				fppb.setBounds(0, 0, 15, 680);
				fppb.setValue(h.getPlayer1().getPayloadPos());
				fppb.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
				fppb.setForeground(Color.RED);
				f.add(fppb);
				y.setLayout(null);
				sppb = new JProgressBar(SwingConstants.VERTICAL, 0, 6);
				sppb.setBounds(0, 0, 15, 680);
				sppb.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
				sppb.setValue(h.getPlayer2().getPayloadPos());
				sppb.setForeground(Color.RED);
				y.add(sppb);
				e.setLayout(null);
				pieceinf = new JTextArea();
				pieceinf.setEnabled(false);
				pieceinf.setBounds(0, 0, 135, 240);
				pieceinf.setBackground(Color.GRAY);
				pieceinf.setFont(new Font("Arial", Font.PLAIN, 18));
				pieceinf.setLineWrap(true);
				pieceinf.setForeground(Color.red);
				pieceinf.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
				e.add(pieceinf);
				mb = new JButton("Move");
				pb = new JButton("Use Power");
				mb.setBounds(0, 240, 65, 60);
				hand12 x1 = new hand12();
				mb.addActionListener(x1);
				pb.setBounds(65, 240, 70, 60);
				mb.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
				pb.setBorder(BorderFactory.createLineBorder(Color.green, 1, true));
				e.add(mb);
				e.add(pb);
				matchboard(h);
				handelusepower gh = new handelusepower();
				pb.addActionListener(gh);
				card.show(container, "gamePage");

			}

		}
	}

	private class handler implements MouseListener {

		public void mouseClicked(MouseEvent event) {

			i = Integer.parseInt(((JButton) event.getComponent()).getName().charAt(0) + "");
			j = Integer.parseInt(((JButton) event.getComponent()).getName().charAt(1) + "");
			board1[i][j].setIcon(q13);
			if (a11 == -15 && a22 == -15) {
				a11 = i;
				a22 = j;
				ff1 = h.getCellAt(i, j).getPiece();
				board1[i][j].setIcon(q14);
				board1[i][j].setToolTipText("you had choised your piece to move or use power");

			} else if (!fds) {
				dw = spdir(a11, a22, i, j);
				if (!(h.getCellAt(a11, a22).getPiece() instanceof Medic))
					ff = h.getCellAt(i, j).getPiece();
				fds = true;
				if (h.getCellAt(a11, a22).getPiece() instanceof Tech) {
					board1[i][j].setToolTipText("you had choised the piece");
				} else {
					board1[i][j].setToolTipText("you had choised the direction");
				}
			} else if ((!fds1) && (h.getCellAt(a11, a22).getPiece() instanceof Tech)) {
				board1[i][j].setToolTipText("you had choised the the cell to transport in it");
				l12 = new Point(i, j);
				board1[i][j].setIcon(q15);
				fds1 = true;
			} else {
				a11 = -15;
				a22 = -15;
				fds = false;
				fds1 = false;
				reloadall();
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			int i1 = Integer.parseInt(e.getComponent().getName().charAt(0) + "");
			int j1 = Integer.parseInt(e.getComponent().getName().charAt(1) + "");

			String l;
			Piece q1;
			if (h.getCellAt(i1, j1).getPiece() != null) {
				l = h.getCellAt(i1, j1).getPiece().getName();
				q1 = h.getCellAt(i1, j1).getPiece();
			} else {
				l = "";
				q1 = null;
			}
			if (((JButton) e.getComponent()).getIcon() == q12)
				((JButton) e.getComponent()).setIcon(q11);

			go(l, q1);
			d.revalidate();
			d.repaint();
			pieceinf.revalidate();
			pieceinf.repaint();
			if (a11 == -15 && a22 == -15) {
				board1[i1][j1].setToolTipText("Choise your piece to move or use power");
			} else if (!fds) {
				if (h.getCellAt(a11, a22).getPiece() instanceof Tech) {
					board1[i1][j1].setToolTipText("Choise the piece to hack or transport it or direction to move");
				} else {
					board1[i1][j1].setToolTipText("Choise the direction");
				}

			} else if ((!fds1) && (h.getCellAt(a11, a22).getPiece() instanceof Tech)) {
				if (h.getCellAt(a11, a22).getPiece() instanceof Tech) {
					board1[i1][j1].setToolTipText("choise location transport piece if yo want to transport");
				}
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (((JButton) e.getComponent()).getIcon() == q11)
				((JButton) e.getComponent()).setIcon(q12);

		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}
	}

	private class hand1234 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			pieceinf.setText(" ");
			card1.show(container1, "l17");
			d.revalidate();
			d.repaint();
			pieceinf.revalidate();
			pieceinf.repaint();
		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

	}

	private void go(String s, Piece a) {

		if (a != null) {
			if (s.equals("Deadpool")) {
				if (((Armored) a).isArmorUp())
					card1.show(container1, "l1");
				else
					card1.show(container1, "l16");

				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Armed Up :" + "\n" + (((Armored) a).isArmorUp()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Captain America")) {
				if (((Armored) a).isArmorUp())
					card1.show(container1, "l2");
				else
					card1.show(container1, "l15");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Armed Up :" + "\n" + (((Armored) a).isArmorUp()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Green Lantern")) {
				card1.show(container1, "l3");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
						+ (((ActivatablePowerHero) a).isPowerUsed()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Vision")) {
				card1.show(container1, "l4");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
						+ (((ActivatablePowerHero) a).isPowerUsed()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Green Arrow")) {
				card1.show(container1, "l5");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
						+ (((ActivatablePowerHero) a).isPowerUsed()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Hawk Eye")) {
				card1.show(container1, "l6");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
						+ (((ActivatablePowerHero) a).isPowerUsed()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Flash")) {
				card1.show(container1, "l7");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Quick Silver")) {
				card1.show(container1, "l8");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Superman")) {
				card1.show(container1, "l9");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
						+ (((ActivatablePowerHero) a).isPowerUsed()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Hulk")) {
				card1.show(container1, "l10");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
						+ (((ActivatablePowerHero) a).isPowerUsed()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Batman")) {
				card1.show(container1, "l11");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
						+ (((ActivatablePowerHero) a).isPowerUsed()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("Ironman")) {
				card1.show(container1, "l12");
				pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
						+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
						+ (((ActivatablePowerHero) a).isPowerUsed()));
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("SK10") || s.equals("SK11") || s.equals("SK12") || s.equals("SK13") || s.equals("SK14")
					|| s.equals("SK15") || s.equals("SK16")) {
				if (gettybe(a) == "Armored") {
					card1.show(container1, "l2");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Armed Up :" + "\n" + (((Armored) a).isArmorUp()));
				} else if (gettybe(a) == "Medic") {
					card1.show(container1, "l4");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
							+ (((ActivatablePowerHero) a).isPowerUsed()));
				} else if (gettybe(a) == "Ranged") {
					card1.show(container1, "l6");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
							+ (((ActivatablePowerHero) a).isPowerUsed()));
				} else if (gettybe(a) == "Speedster") {
					card1.show(container1, "l8");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a));
				} else if (gettybe(a) == "Super") {
					card1.show(container1, "l10");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
							+ (((ActivatablePowerHero) a).isPowerUsed()));
				} else if (gettybe(a) == "Tech") {
					card1.show(container1, "l12");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
							+ (((ActivatablePowerHero) a).isPowerUsed()));
				} else {
					card1.show(container1, "l13");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a));
				}
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
			if (s.equals("SK20") || s.equals("SK21") || s.equals("SK22") || s.equals("SK23") || s.equals("SK24")
					|| s.equals("SK25") || s.equals("SK26")) {
				if (gettybe(a) == "Armored") {
					card1.show(container1, "l1");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Armed Up :" + "\n" + (((Armored) a).isArmorUp()));
				} else if (gettybe(a) == "Medic") {
					card1.show(container1, "l3");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
							+ (((ActivatablePowerHero) a).isPowerUsed()));
				} else if (gettybe(a) == "Ranged") {
					card1.show(container1, "l5");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
							+ (((ActivatablePowerHero) a).isPowerUsed()));
				} else if (gettybe(a) == "Speedster") {
					card1.show(container1, "l7");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a));
				} else if (gettybe(a) == "Super") {
					card1.show(container1, "l9");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
							+ (((ActivatablePowerHero) a).isPowerUsed()));
				} else if (gettybe(a) == "Tech") {
					card1.show(container1, "l11");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a) + "\n" + "Use Power :" + "\n"
							+ (((ActivatablePowerHero) a).isPowerUsed()));
				} else {
					card1.show(container1, "l14");
					pieceinf.setText("Piece Owner :" + "\n" + a.getOwner().getName() + "\n" + "Name :" + "\n" + s + "\n"
							+ "Type :" + "\n" + gettybe(a));
				}
				d.revalidate();
				d.repaint();
				pieceinf.revalidate();
				pieceinf.repaint();
			}
		} else {
			pieceinf.setText(" ");
			card1.show(container1, "l17");
			d.revalidate();
			d.repaint();
			pieceinf.revalidate();
			pieceinf.repaint();

		}
	}

	private Point movesped(Game d, Piece p, Direction h) {
		switch (h) {
		case UP: {

			int c = p.getPosI() - 2 + d.getBoardHeight();
			c %= p.getGame().getBoardHeight();
			return new Point(c, p.getPosJ());
		}

		case DOWN: {

			int c = p.getPosI() + 2;

			c %= p.getGame().getBoardHeight();

			return new Point(c, p.getPosJ());

		}

		case RIGHT: {

			int c = p.getPosJ() + 2;

			c %= p.getGame().getBoardWidth();

			return new Point(p.getPosJ(), c);

		}

		case LEFT: {

			int c = p.getPosJ() - 2 + d.getBoardWidth();

			c %= p.getGame().getBoardWidth();
			return new Point(p.getPosJ(), c);

		}

		case UPRIGHT: {

			int c = p.getPosI() - 2 + p.getGame().getBoardHeight();
			int d1 = p.getPosJ() + 2;

			c %= p.getGame().getBoardHeight();

			d1 %= p.getGame().getBoardWidth();

			return new Point(c, d1);

		}

		case UPLEFT: {

			int newX = p.getPosI() - 2 + p.getGame().getBoardHeight();
			int newY = p.getPosJ() - 2 + p.getGame().getBoardWidth();

			newX %= p.getGame().getBoardHeight();

			newY %= p.getGame().getBoardWidth();

			return new Point(newX, newY);
		}

		case DOWNRIGHT: {

			int newX = p.getPosI() + 2;
			int newY = p.getPosJ() + 2;

			newX %= p.getGame().getBoardHeight();

			newY %= p.getGame().getBoardWidth();

			return new Point(newX, newY);

		}

		case DOWNLEFT: {

			int newX = p.getPosI() + 2;
			int newY = p.getPosJ() - 2 + p.getGame().getBoardWidth();

			newX %= p.getGame().getBoardHeight();

			newY %= p.getGame().getBoardWidth();

			return new Point(newX, newY);
		}
		default:
			return new Point(-8, -8);
		}
	}

	private Point movepiece(Game d, Piece p, Direction h) {

		switch (h) {
		case UP: {

			int c = p.getPosI() - 1 + d.getBoardHeight();
			c %= p.getGame().getBoardHeight();
			return new Point(c, p.getPosJ());
		}

		case DOWN: {

			int c = p.getPosI() + 1;

			c %= p.getGame().getBoardHeight();

			return new Point(c, p.getPosJ());

		}

		case RIGHT: {

			int c = p.getPosJ() + 1;

			c %= p.getGame().getBoardWidth();

			return new Point(p.getPosI(), c);

		}

		case LEFT: {

			int c = p.getPosJ() - 1 + d.getBoardWidth();

			c %= p.getGame().getBoardWidth();
			return new Point(p.getPosI(), c);

		}

		case UPRIGHT: {

			int c = p.getPosI() - 1 + p.getGame().getBoardHeight();
			int d1 = p.getPosJ() + 1;

			c %= p.getGame().getBoardHeight();

			d1 %= p.getGame().getBoardWidth();

			return new Point(c, d1);

		}

		case UPLEFT: {

			int newX = p.getPosI() - 1 + p.getGame().getBoardHeight();
			int newY = p.getPosJ() - 1 + p.getGame().getBoardWidth();

			newX %= p.getGame().getBoardHeight();

			newY %= p.getGame().getBoardWidth();

			return new Point(newX, newY);
		}

		case DOWNRIGHT: {

			int newX = p.getPosI() + 1;
			int newY = p.getPosJ() + 1;

			newX %= p.getGame().getBoardHeight();

			newY %= p.getGame().getBoardWidth();

			return new Point(newX, newY);

		}

		case DOWNLEFT: {

			int newX = p.getPosI() + 1;
			int newY = p.getPosJ() - 1 + p.getGame().getBoardWidth();

			newX %= p.getGame().getBoardHeight();

			newY %= p.getGame().getBoardWidth();

			return new Point(newX, newY);
		}
		default:
			return new Point(-8, -8);
		}
	}

	private class hand12 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (a11 != -15 && a22 != -15) {
				board1[a11][a22].setIcon(q12);
				board1[i][j].setIcon(q12);

				if (a11 != i || a22 != j) {
					Direction di = spdir(a11, a22, i, j);
					Point p12;
					if (di != null) {
						if (h.getCellAt(a11, a22).getPiece() instanceof Speedster) {
							p12 = movesped(h, h.getCellAt(a11, a22).getPiece(), di);
							i = (int) p12.getX();
							j = (int) p12.getY();
						} else {
							p12 = movepiece(h, h.getCellAt(a11, a22).getPiece(), di);
							i = (int) p12.getX();
							j = (int) p12.getY();
						}
						if (h.getCellAt(a11, a22).getPiece() != null) {
							try {
								boolean a = false;
								if (h.getCellAt(a11, a22).getPiece() instanceof SideKick) {
									a = true;
								}

								h.getCellAt(a11, a22).getPiece().move(di);

								if (h.getCellAt(a11, a22).getPiece() == null) {
									if (board[i][j] == null) {
										board1[i][j].add(board[a11][a22]);
										board[i][j] = board[a11][a22];
										board1[a11][a22].remove(board[a11][a22]);
										board[a11][a22] = null;
									} else if (a && !(h.getCellAt(i, j).getPiece() instanceof SideKick)) {
										JLabel as = new JLabel(board[i][j].getIcon());
										if (h.getCurrentPlayer() == h.getPlayer1()) {
											b1.add(as);
											as.addMouseListener(f12);
										} else {
											b2.add(as);
											as.addMouseListener(f12);
										}
										board1[a11][a22].remove(board[a11][a22]);
										board[a11][a22] = null;
									} else {
										if (h.getCurrentPlayer() == h.getPlayer1()) {
											b1.add(board[i][j]);
											board[i][j].addMouseListener(f12);

										} else {
											b2.add(board[i][j]);
											board[i][j].addMouseListener(f12);
										}
										board1[i][j].remove(board[i][j]);
										board1[i][j].add(board[a11][a22]);
										board[i][j] = board[a11][a22];
										board1[a11][a22].remove(board[a11][a22]);
										board[a11][a22] = null;
									}

								}

							} catch (WrongTurnException e1) {
								CustomDialog asd = new CustomDialog("It is not your turn !");
								asd.show();
							} catch (UnallowedMovementException e1) {
								CustomDialog asd = new CustomDialog("Unallowed Movement !");
								asd.show();
							} catch (OccupiedCellException e1) {
								CustomDialog asd = new CustomDialog("Occupied Cell !");
								asd.show();
							}

						}
					}
					board1[a11][a22].setIcon(q12);
					board1[i][j].setIcon(q12);

					fppb.setValue(h.getPlayer1().getPayloadPos());
					sppb.setValue(h.getPlayer2().getPayloadPos());

					currentplayr.setText(h.getCurrentPlayer().getName());

					if (h.getCurrentPlayer() == h.getPlayer1()) {
						card2.show(container2, "by1");
					} else
						card2.show(container2, "by2");

					String l;
					Piece q1;
					if (h.getCellAt(i, j).getPiece() != null) {
						l = h.getCellAt(i, j).getPiece().getName();
						q1 = h.getCellAt(i, j).getPiece();
					} else {
						l = "";
						q1 = null;
					}
					go(l, q1);
					reloadall();
					a11 = -15;
					a22 = -15;
					l12 = null;
					fds = false;
					fds1 = false;

					if (h.getPlayer1().getPayloadPos() == 6) {
						thewiner.setText("The Winner Was : " + h.getPlayer1().getName());
						card.show(container, "gameover");
					}
					if (h.getPlayer2().getPayloadPos() == 6) {
						thewiner.setText("The Winner Was : " + h.getPlayer2().getName());
						card.show(container, "gameover");
					}
					revalidate();
					repaint();
				}
			}
		}

	}

	private Direction spdir(int x, int y, int z, int ds) {
		if (x == z && (((y + 1) % h.getBoardWidth() == ds) || ((y + 2) % h.getBoardWidth() == ds)))
			return Direction.RIGHT;
		if (x == z
				&& ((((y - 1) + h.getBoardWidth()) % h.getBoardWidth() == ds) || ((y - 2) % h.getBoardWidth() == ds)))
			return Direction.LEFT;
		if ((((x + 1) % h.getBoardHeight() == z) || ((x + 2) % h.getBoardHeight() == z)) && y == ds)
			return Direction.DOWN;
		if ((((((x - 1) + h.getBoardHeight()) % h.getBoardHeight()) == z) || ((x - 2) % h.getBoardWidth() == z))
				&& y == ds)
			return Direction.UP;
		if ((((y + 1) % h.getBoardWidth() == ds) && ((x + 1) % h.getBoardHeight() == z))
				|| (((y + 2) % h.getBoardWidth() == ds) && ((x + 2) % h.getBoardHeight() == z)))
			return Direction.DOWNRIGHT;
		if (((((y - 1) + h.getBoardWidth()) % h.getBoardWidth() == ds) && ((x + 1) % h.getBoardHeight() == z))
				|| ((((y - 2) + h.getBoardWidth()) % h.getBoardWidth() == ds) && ((x + 2) % h.getBoardHeight() == z)))
			return Direction.DOWNLEFT;
		if ((((y + 1) % h.getBoardWidth() == ds) && (((x - 1) + h.getBoardHeight()) % h.getBoardHeight() == z))
				|| (((y + 2) % h.getBoardWidth() == ds) && (((x - 2) + h.getBoardHeight()) % h.getBoardHeight() == z)))
			return Direction.UPRIGHT;
		if (((((y - 1) + h.getBoardWidth()) % h.getBoardWidth() == ds)
				&& (((x - 1) + h.getBoardHeight()) % h.getBoardHeight() == z))
				|| ((((y - 2) + h.getBoardWidth()) % h.getBoardWidth() == ds)
						&& (((x - 2) + h.getBoardHeight()) % h.getBoardHeight() == z)))
			return Direction.UPLEFT;
		return null;

	}

	private void matchboard(Game h) {
		dfdf();
		dfdf(h);
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 5; j++) {
				if (board[i][j] != null)
					board1[i][j].add(board[i][j]);

				board1[i][j].setName(i + "" + j);
				board1[i][j].addMouseListener(ut);
				c.add(board1[i][j]);
			}
		}

	}

	public void dfdf(Game h) {
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 5; j++) {
				if (h.getCellAt(i, j).getPiece() != null) {
					String s = h.getCellAt(i, j).getPiece().getName();
					if (s.equals("Deadpool")) {
						backgroundImage1.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage1;
					}
					if (s.equals("Captain America")) {
						backgroundImage2.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage2;
					}
					if (s.equals("Green Lantern")) {
						backgroundImage3.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage3;

					}
					if (s.equals("Vision")) {
						backgroundImage4.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage4;
					}
					if (s.equals("Green Arrow")) {
						backgroundImage5.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage5;
					}
					if (s.equals("Hawk Eye")) {
						backgroundImage6.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage6;
					}
					if (s.equals("Flash")) {
						backgroundImage7.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage7;
					}
					if (s.equals("Quick Silver")) {
						backgroundImage8.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage8;
					}
					if (s.equals("Superman")) {
						backgroundImage9.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage9;
					}
					if (s.equals("Hulk")) {
						backgroundImage10.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage10;
					}
					if (s.equals("Batman")) {
						backgroundImage11.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage11;
					}
					if (s.equals("Ironman")) {
						backgroundImage12.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage12;
					}
					if (s.equals("SK1" + 0)) {
						backgroundImage13.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage13;
					}
					if (s.equals("SK1" + 1)) {
						backgroundImage14.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage14;
					}
					if (s.equals("SK1" + 2)) {
						backgroundImage15.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage15;
					}
					if (s.equals("SK1" + 3)) {
						backgroundImage16.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage16;
					}

					if (s.equals("SK1" + 4)) {
						backgroundImage17.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage17;
					}
					if (s.equals("SK1" + 5)) {
						backgroundImage18.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage18;
					}

					if (s.equals("SK2" + 0)) {
						backgroundImage19.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage19;
					}
					if (s.equals("SK2" + 1)) {
						backgroundImage20.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage20;
					}
					if (s.equals("SK2" + 2)) {
						backgroundImage21.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage21;
					}
					if (s.equals("SK2" + 3)) {
						backgroundImage22.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage22;
					}
					if (s.equals("SK2" + 4)) {
						backgroundImage23.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage23;
					}
					if (s.equals("SK2" + 5)) {
						backgroundImage24.setBounds(20, 10, 50, 80);
						board[i][j] = backgroundImage24;
					}

				} else
					board[i][j] = null;
			}
		}
	}

	private class CustomDialog {

		private JDialog dialog;
		private final JLabel label;
		private final JButton button;

		public CustomDialog(String s) {

			dialog = new JDialog();
			label = new JLabel(s);
			button = new JButton("close");

			label.setBounds(40, 50, 400, 30);
			button.setBounds(460, 50, 70, 30);

			dialog.setLocationRelativeTo(f);
			dialog.setLayout(null);
			dialog.setSize(550, 170);
			dialog.setTitle("Super Hero Chess");
			dialog.setModal(false);

			dialog.add(label);
			dialog.add(button);

			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dialog.setVisible(false);
				}
			});

		}

		public void show() {
			dialog.setVisible(true);
		}

	}

	private void removecar(Piece q, Direction g) {
		int x = q.getPosI();
		int y = q.getPosJ();
		switch (g) {
		case UP: {
			for (int i = 0; i < 7; i++) {
				if (h.getCellAt(i, y).getPiece() == null && board[i][y] != null) {
					if (h.getCurrentPlayer() == h.getPlayer1()) {
						b1.add(board[i][y]);
						board[i][y].addMouseListener(f12);
					} else {
						b2.add(board[i][y]);
						board[i][y].addMouseListener(f12);
					}
					board[i][y].addMouseListener(f12);
					board1[i][i].remove(board[i][y]);
					board[i][y] = null;
				}
			}

		}
			break;

		case DOWN: {
			for (int i = 0; i < 7; i++) {
				if (h.getCellAt(i, y).getPiece() == null && board[i][y] != null) {
					if (h.getCurrentPlayer() == h.getPlayer1()) {
						b1.add(board[i][y]);
						board[i][y].addMouseListener(f12);
					} else {
						b2.add(board[i][y]);
						board[i][y].addMouseListener(f12);
					}
					board[i][y].addMouseListener(f12);
					board1[i][i].remove(board[i][y]);
					board[i][y] = null;
				}
			}

		}
			break;

		case RIGHT: {
			for (int i = 0; i < 6; i++) {
				if (h.getCellAt(x, i).getPiece() == null && board[x][i] != null) {
					if (h.getCurrentPlayer() == h.getPlayer1()) {
						b1.add(board[x][i]);
						board[x][i].addMouseListener(f12);
					} else {
						b2.add(board[x][i]);
						board[x][i].addMouseListener(f12);
					}
					board[x][i].addMouseListener(f12);
					board1[x][i].remove(board[x][i]);
					board[x][i] = null;
				}
			}

		}
			break;

		case LEFT: {

			for (int i = 0; i < 6; i++) {
				if (h.getCellAt(x, i).getPiece() == null && board[x][i] != null) {
					if (h.getCurrentPlayer() == h.getPlayer1()) {
						b1.add(board[x][i]);
						board[x][i].addMouseListener(f12);
					} else {
						b2.add(board[x][i]);
						board[x][i].addMouseListener(f12);
					}
					board[x][i].addMouseListener(f12);
					board1[x][i].remove(board[x][i]);
					board[x][i] = null;
				}
			}

		}
			break;

		default:
			break;
		}
	}

	private class handelusepower implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (ff1 instanceof Ranged) {
				try {
					((Ranged) ff1).usePower(dw, ff, l12);
					removecar(ff1, dw);
				} catch (InvalidPowerUseException e) {
					CustomDialog asd = new CustomDialog(e.getMessage());
					asd.show();
				} catch (WrongTurnException e) {
					CustomDialog asd = new CustomDialog("It is not your turn !");
					asd.show();
				}

			}
			if (ff1 instanceof Super) {
				try {
					((Super) ff1).usePower(dw, ff, l12);
					removecar(ff1, dw);

				} catch (InvalidPowerUseException e) {
					CustomDialog asd = new CustomDialog(e.getMessage());
					asd.show();
				} catch (WrongTurnException e) {
					CustomDialog asd = new CustomDialog("It is not your turn !");
					asd.show();
				}
			}
			if (ff1 instanceof Tech) {
				try {
					int x = ff.getPosI();
					int y = ff.getPosJ();
					((Tech) ff1).usePower(dw, ff, l12);
					if (l12 != null && ff != null) {
						board1[l12.x][l12.y].add(board[x][y]);
						board[l12.x][l12.y] = board[x][y];
						board1[x][y].remove(board[x][y]);
						board[x][y] = null;
					}
				} catch (InvalidPowerUseException e) {
					CustomDialog asd = new CustomDialog(e.getMessage());
					asd.show();
				} catch (WrongTurnException e) {
					CustomDialog asd = new CustomDialog("It is not your turn !");
					asd.show();
				}
			}
			if (ff1 instanceof Medic) {
				try {
					if (dw != null && ff != null && l12 == null) {
						((Medic) ff1).usePower(dw, ff, l12);
						Point destination = ff1.getDirectionPos(new Point(ff1.getPosI(), ff1.getPosJ()), dw);
						ff1.adjustBounds(destination);
						dff.setBounds(20, 10, 50, 80);
						dff.removeMouseListener(f12);
						dff.setToolTipText(null);
						dff.repaint();
						dff.revalidate();
						if (h.getCurrentPlayer() == h.getPlayer1()) {
							board1[destination.x][destination.y].add(dff);
							board[destination.x][destination.y] = dff;
							board[destination.x][destination.y].removeMouseListener(f12);
							b1.remove(board[destination.x][destination.y]);
						} else {
							board1[destination.x][destination.y].add(dff);
							board[destination.x][destination.y] = dff;
							board[destination.x][destination.y].removeMouseListener(f12);
							b2.remove(board[destination.x][destination.y]);
						}
					}
				} catch (InvalidPowerUseException e) {
					CustomDialog asd = new CustomDialog(e.getMessage());
					asd.show();
				} catch (WrongTurnException e) {
					CustomDialog asd = new CustomDialog("It is not your turn !");
					asd.show();
				}

			}

			fppb.setValue(h.getPlayer1().getPayloadPos());
			sppb.setValue(h.getPlayer2().getPayloadPos());

			currentplayr.setText(h.getCurrentPlayer().getName());

			if (h.getCurrentPlayer() == h.getPlayer1()) {
				card2.show(container2, "by1");
			} else
				card2.show(container2, "by2");

			String l;
			Piece q1;
			if (h.getCellAt(i, j).getPiece() != null) {
				l = h.getCellAt(i, j).getPiece().getName();
				q1 = h.getCellAt(i, j).getPiece();
			} else {
				l = "";
				q1 = null;
			}
			go(l, q1);
			reloadall();
			a11 = -15;
			a22 = -15;
			fds = false;
			l12 = null;
			fds1 = false;

			if (h.getPlayer1().getPayloadPos() == 6) {
				thewiner.setText("The Winner Was : " + h.getPlayer1().getName());
				card.show(container, "gameover");
			}
			if (h.getPlayer2().getPayloadPos() == 6) {
				thewiner.setText("The Winner Was : " + h.getPlayer2().getName());
				card.show(container, "gameover");
			}
			revalidate();
			repaint();
		}
	}

	private void reloadall() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				board1[i][j].setIcon(q12);
				board1[i][j].revalidate();
				board1[i][j].repaint();
			}
		}
	}

	private class handella implements MouseListener {

		public void mouseClicked(MouseEvent e) {

				dff = (JLabel) e.getSource();
				dff.setToolTipText("you had selected this piece to readd to board");
         
				if (h.getCurrentPlayer() == h.getPlayer1()) {
					t = b1.getComponentZOrder((Component) e.getSource());
					ff = h.getCurrentPlayer().getDeadCharacters().get(t);

				} else {
					t = b2.getComponentZOrder((Component) e.getSource());
					ff = h.getCurrentPlayer().getDeadCharacters().get(t);

				}


			

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			((JLabel) e.getSource()).setToolTipText("if you select your medic piece select piece to readd to board");

		}

		@Override
		public void mouseExited(MouseEvent arg0) {

		}

		@Override
		public void mousePressed(MouseEvent arg0) {

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {

		}

	}

	private void dothat() {
		card1 = new CardLayout();
		container1 = d;
		container1.setLayout(card1);

		JLabel l1 = new JLabel(new ImageIcon(this.getClass().getResource("Deadpool.jpg")));
		JLabel l2 = new JLabel(new ImageIcon(this.getClass().getResource("captinofam.png")));
		JLabel l3 = new JLabel(new ImageIcon(this.getClass().getResource("greenlantenr.jpg")));
		JLabel l4 = new JLabel(new ImageIcon(this.getClass().getResource("vision.png")));
		JLabel l5 = new JLabel(new ImageIcon(this.getClass().getResource("greenarrow.jpg")));
		JLabel l6 = new JLabel(new ImageIcon(this.getClass().getResource("hawk eye.jpg")));
		JLabel l7 = new JLabel(new ImageIcon(this.getClass().getResource("flash.jpg")));
		JLabel l8 = new JLabel(new ImageIcon(this.getClass().getResource("quickselvir.png")));
		JLabel l9 = new JLabel(new ImageIcon(this.getClass().getResource("superman.jpg")));
		JLabel l10 = new JLabel(new ImageIcon(this.getClass().getResource("hulk.png")));
		JLabel l11 = new JLabel(new ImageIcon(this.getClass().getResource("batman.jpg")));
		JLabel l12 = new JLabel(new ImageIcon(this.getClass().getResource("ironman.jpg")));
		JLabel l13 = new JLabel(new ImageIcon(this.getClass().getResource("sidek1.jpg")));
		JLabel l14 = new JLabel(new ImageIcon(this.getClass().getResource("sidek2.png")));
		JLabel l15 = new JLabel(new ImageIcon(this.getClass().getResource("capten of without.jpg")));
		JLabel l16 = new JLabel(new ImageIcon(this.getClass().getResource("Deadpoolwhithout.jpg")));
		JLabel l17 = new JLabel(new ImageIcon(this.getClass().getResource("123.jpg")));

		l1.setBounds(0, 0, d.getWidth(), d.getHeight());
		l2.setBounds(0, 0, d.getWidth(), d.getHeight());
		l3.setBounds(0, 0, d.getWidth(), d.getHeight());
		l4.setBounds(0, 0, d.getWidth(), d.getHeight());
		l5.setBounds(0, 0, d.getWidth(), d.getHeight());
		l6.setBounds(0, 0, d.getWidth(), d.getHeight());
		l7.setBounds(0, 0, d.getWidth(), d.getHeight());
		l8.setBounds(0, 0, d.getWidth(), d.getHeight());
		l9.setBounds(0, 0, d.getWidth(), d.getHeight());
		l10.setBounds(0, 0, d.getWidth(), d.getHeight());
		l11.setBounds(0, 0, d.getWidth(), d.getHeight());
		l12.setBounds(0, 0, d.getWidth(), d.getHeight());
		l13.setBounds(0, 0, d.getWidth(), d.getHeight());
		l14.setBounds(0, 0, d.getWidth(), d.getHeight());
		l15.setBounds(0, 0, d.getWidth(), d.getHeight());
		l16.setBounds(0, 0, d.getWidth(), d.getHeight());
		l17.setBounds(0, 0, d.getWidth(), d.getHeight());

		d.add(l1);
		d.add(l2);
		d.add(l3);
		d.add(l4);
		d.add(l5);
		d.add(l6);
		d.add(l7);
		d.add(l8);
		d.add(l9);
		d.add(l10);
		d.add(l11);
		d.add(l12);
		d.add(l13);
		d.add(l14);
		d.add(l15);
		d.add(l16);
		d.add(l17);

		container1.getLayout().addLayoutComponent("l1", l1);
		container1.getLayout().addLayoutComponent("l2", l2);
		container1.getLayout().addLayoutComponent("l3", l3);
		container1.getLayout().addLayoutComponent("l4", l4);
		container1.getLayout().addLayoutComponent("l5", l5);
		container1.getLayout().addLayoutComponent("l6", l6);
		container1.getLayout().addLayoutComponent("l7", l7);
		container1.getLayout().addLayoutComponent("l8", l8);
		container1.getLayout().addLayoutComponent("l9", l9);
		container1.getLayout().addLayoutComponent("l10", l10);
		container1.getLayout().addLayoutComponent("l11", l11);
		container1.getLayout().addLayoutComponent("l12", l12);
		container1.getLayout().addLayoutComponent("l13", l13);
		container1.getLayout().addLayoutComponent("l14", l14);
		container1.getLayout().addLayoutComponent("l15", l15);
		container1.getLayout().addLayoutComponent("l16", l16);
		container1.getLayout().addLayoutComponent("l17", l17);

	}

	private String gettybe(Piece b) {
		if (b instanceof Medic) {
			return "Medic";
		}
		if (b instanceof Speedster) {
			return "Speedster";
		}
		if (b instanceof Tech) {
			return "Tech";
		}
		if (b instanceof Armored) {
			return "Armored";
		}
		if (b instanceof Ranged) {
			return "Ranged";
		}
		if (b instanceof Super) {
			return "Super";
		}
		if (b instanceof SideKick) {
			return "SideKick";
		}
		return "";
	}

	public static void main(String[] a) {
		TheGame x = new TheGame();
		x.setDefaultCloseOperation(EXIT_ON_CLOSE);
		x.setSize(820, 720);
		x.setVisible(true);
		x.setLocationRelativeTo(null);
		x.setAutoRequestFocus(true);
		x.setResizable(false);
	}

}
