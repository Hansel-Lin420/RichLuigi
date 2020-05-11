import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Color;

public class MainFrame extends JFrame {
	public MainFrame() {
		initComp();
	}

	private JButton Dice = new JButton("擲骰子");
	private Timer t1;// 骰子換圖速度
	private Timer t2, t3, t4, t5;// 腳色移動速度
	private ImageIcon[] ch = new ImageIcon[4];// 腳色圖片
	private ImageIcon[] info = new ImageIcon[4];// 腳色狀態圖
	private int i, j, k, l, m = 0, n = 0, o1, o2, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, buy1, buy2, buy3, buy4,
			ys = 50000, bs = 50000, gs = 50000, rs = 50000, g1, g2, g3, g4, nsr, f = 0;;
	private int[] lvit = new int[36];
	private Random rnd = new Random();
	private Random rnd1 = new Random();
	private Random fate = new Random();
	private Random ns = new Random();
	private Random r = new Random();
	private Random opp = new Random();
	private JLabel dice1 = new JLabel();
	private JLabel dice2 = new JLabel();
	private JLabel lby = new JLabel();
	private JLabel lbb = new JLabel();
	private JLabel lbg = new JLabel();
	private JLabel lbr = new JLabel();
	private JLabel infoy = new JLabel();
	private JLabel infob = new JLabel();
	private JLabel infog = new JLabel();
	private JLabel infor = new JLabel();
	private JLabel infoys = new JLabel();
	private JLabel infobs = new JLabel();
	private JLabel infogs = new JLabel();
	private JLabel infors = new JLabel();
	private JLabel lab00 = new JLabel();
	private JLabel lab01 = new JLabel();
	private JLabel labDice = new JLabel();
	private JTextArea rule = new JTextArea();
	private ImageIcon[] img = new ImageIcon[6];
	private JLabel p[] = new JLabel[36];
	private JLabel lv[] = new JLabel[36];
	private JLabel nation[] = new JLabel[36];
	private JButton nationp[] = new JButton[36];

	private void initComp() {
		ch[0] = new ImageIcon("y.png");
		ch[1] = new ImageIcon("b.png");
		ch[2] = new ImageIcon("g.png");
		ch[3] = new ImageIcon("r.png");
		info[0] = new ImageIcon("imgy.png");
		info[1] = new ImageIcon("imgb.png");
		info[2] = new ImageIcon("imgg.png");
		info[3] = new ImageIcon("imgr.png");
		img[0] = new ImageIcon("1.jpg");
		img[1] = new ImageIcon("2.jpg");
		img[2] = new ImageIcon("3.jpg");
		img[3] = new ImageIcon("4.jpg");
		img[4] = new ImageIcon("5.jpg");
		img[5] = new ImageIcon("6.jpg");

		nation[0] = new JLabel("台北Go!!", SwingConstants.CENTER);
		nation[1] = new JLabel("廣東", SwingConstants.CENTER);
		nation[2] = new JLabel("四川", SwingConstants.CENTER);
		nation[3] = new JLabel("上海", SwingConstants.CENTER);
		nation[4] = new JLabel("命運", SwingConstants.CENTER);
		nation[5] = new JLabel("首爾", SwingConstants.CENTER);
		nation[6] = new JLabel("大阪", SwingConstants.CENTER);
		nation[7] = new JLabel("北海道", SwingConstants.CENTER);
		nation[8] = new JLabel("東京", SwingConstants.CENTER);
		nation[9] = new JLabel("北韓", SwingConstants.CENTER);
		nation[10] = new JLabel("倫敦", SwingConstants.CENTER);
		nation[11] = new JLabel("里斯本", SwingConstants.CENTER);
		nation[12] = new JLabel("巴黎", SwingConstants.CENTER);
		nation[13] = new JLabel("機會", SwingConstants.CENTER);
		nation[14] = new JLabel("柏林", SwingConstants.CENTER);
		nation[15] = new JLabel("捷克", SwingConstants.CENTER);
		nation[16] = new JLabel("馬德里", SwingConstants.CENTER);
		nation[17] = new JLabel("羅馬", SwingConstants.CENTER);
		nation[18] = new JLabel("機場", SwingConstants.CENTER);
		nation[19] = new JLabel("洛杉磯", SwingConstants.CENTER);
		nation[20] = new JLabel("鳳凰城", SwingConstants.CENTER);
		nation[21] = new JLabel("丹佛", SwingConstants.CENTER);
		nation[22] = new JLabel("命運", SwingConstants.CENTER);
		nation[23] = new JLabel("西雅圖", SwingConstants.CENTER);
		nation[24] = new JLabel("休士頓", SwingConstants.CENTER);
		nation[25] = new JLabel("達拉斯", SwingConstants.CENTER);
		nation[26] = new JLabel("堪薩斯", SwingConstants.CENTER);
		nation[27] = new JLabel("國稅局", SwingConstants.CENTER);
		nation[28] = new JLabel("華盛頓", SwingConstants.CENTER);
		nation[29] = new JLabel("底特律", SwingConstants.CENTER);
		nation[30] = new JLabel("波士頓", SwingConstants.CENTER);
		nation[31] = new JLabel("紐約", SwingConstants.CENTER);
		nation[32] = new JLabel("機會", SwingConstants.CENTER);
		nation[33] = new JLabel("費城", SwingConstants.CENTER);
		nation[34] = new JLabel("芝加哥", SwingConstants.CENTER);
		nation[35] = new JLabel("紐澤西", SwingConstants.CENTER);
		nationp[0] = new JButton("台北");
		nationp[1] = new JButton("廣東");
		nationp[2] = new JButton("四川");
		nationp[3] = new JButton("上海");
		nationp[4] = new JButton("命運");
		nationp[5] = new JButton("首爾");
		nationp[6] = new JButton("大阪");
		nationp[7] = new JButton("北海道");
		nationp[8] = new JButton("東京");
		nationp[9] = new JButton("北韓");
		nationp[10] = new JButton("倫敦");
		nationp[11] = new JButton("里斯本");
		nationp[12] = new JButton("巴黎");
		nationp[13] = new JButton("機會");
		nationp[14] = new JButton("柏林");
		nationp[15] = new JButton("捷克");
		nationp[16] = new JButton("馬德里");
		nationp[17] = new JButton("羅馬");
		nationp[18] = new JButton("機場");
		nationp[19] = new JButton("洛杉磯");
		nationp[20] = new JButton("鳳凰城");
		nationp[21] = new JButton("丹佛");
		nationp[22] = new JButton("命運");
		nationp[23] = new JButton("西雅圖");
		nationp[24] = new JButton("休士頓");
		nationp[25] = new JButton("達拉斯");
		nationp[26] = new JButton("堪薩斯");
		nationp[27] = new JButton("國稅局");
		nationp[28] = new JButton("華盛頓");
		nationp[29] = new JButton("底特律");
		nationp[30] = new JButton("波士頓");
		nationp[31] = new JButton("紐約");
		nationp[32] = new JButton("機會");
		nationp[33] = new JButton("費城");
		nationp[34] = new JButton("芝加哥");
		nationp[35] = new JButton("紐澤西");
		p[0] = new JLabel("");
		p[1] = new JLabel("1000");
		p[2] = new JLabel("1500");
		p[3] = new JLabel("2500");
		p[4] = new JLabel("");
		p[5] = new JLabel("5000");
		p[6] = new JLabel("2500");
		p[7] = new JLabel("3000");
		p[8] = new JLabel("5000");
		p[9] = new JLabel("");
		p[10] = new JLabel("3000");
		p[11] = new JLabel("1000");
		p[12] = new JLabel("3000");
		p[13] = new JLabel("");
		p[14] = new JLabel("3500");
		p[15] = new JLabel("1500");
		p[16] = new JLabel("1000");
		p[17] = new JLabel("2500");
		p[18] = new JLabel("");
		p[19] = new JLabel("4000");
		p[20] = new JLabel("2500");
		p[21] = new JLabel("1500");
		p[22] = new JLabel("");
		p[23] = new JLabel("1000");
		p[24] = new JLabel("4000");
		p[25] = new JLabel("1000");
		p[26] = new JLabel("1500");
		p[27] = new JLabel("");
		p[28] = new JLabel("5000");
		p[29] = new JLabel("3500");
		p[30] = new JLabel("2000");
		p[31] = new JLabel("5000");
		p[32] = new JLabel("");
		p[33] = new JLabel("1500");
		p[34] = new JLabel("2500");
		p[35] = new JLabel("1000");
		for (int i = 0; i < 36; i++) {
			lvit[i] = 0;
		}
		for (int i = 0; i < 36; i++) {
			lv[i] = new JLabel("lv." + lvit[i]);
		}
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		t1 = new Timer(50, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j = rnd.nextInt(6);
				k = rnd1.nextInt(6);
				dice1.setIcon(img[j]);
				dice1.repaint();
				dice2.setIcon(img[k]);
				dice2.repaint();
				i++;
				if (i == 10) {
					t1.stop();
					i = 0;
					l = k + j + 2;
					labDice.setText("你擲出" + l + "點");
					labDice.repaint();
				}

				if (m == 1) {
					t2.start();
					Dice.setEnabled(false);
				} else if (m == 2) {
					t3.start();
					Dice.setEnabled(false);
				} else if (m == 3) {
					t4.start();
					Dice.setEnabled(false);
				} else if (m == 4) {
					t5.start();
					Dice.setEnabled(false);
				}

			}
		});

		t2 = new Timer(350, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ys != 0) {
					if (l < 0) { // 移動
						if (lby.getX() == 4 && lby.getY() > 80) {
							lby.setLocation(lby.getX(), lby.getY() + 80);
						} else if (lby.getX() < 724 && lby.getY() == 20) {
							lby.setLocation(lby.getX() - 80, (lby.getY()));
						} else if (lby.getX() == 724 && lby.getY() < 740) {
							lby.setLocation(lby.getX(), lby.getY() - 80);
						} else if (lby.getX() > 4 && lby.getY() == 740) {
							lby.setLocation(lby.getX() + 80, lby.getY());
						}
						n--;
					} else {
						if (lby.getX() == 4 && lby.getY() > 80) {
							lby.setLocation(lby.getX(), lby.getY() - 80);
						} else if (lby.getX() < 724 && lby.getY() == 20) {
							lby.setLocation(lby.getX() + 80, (lby.getY()));
						} else if (lby.getX() == 724 && lby.getY() < 740) {
							lby.setLocation(lby.getX(), lby.getY() + 80);
						} else if (lby.getX() > 4 && lby.getY() == 740) {
							lby.setLocation(lby.getX() - 80, lby.getY());
						}
						n++;
					}
					if (lby.getX() == 4 && lby.getY() == 740) {
						Object[] option = { "確認" };
						int salary = JOptionPane.showOptionDialog(null, "獲得$22000", "薪水", JOptionPane.DEFAULT_OPTION,
								JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
						if (salary == JOptionPane.YES_OPTION) {
							ys = ys + 22000;
							infoys.setText("$" + ys);
						}
					}
					if (n == l) {
						Dice.setEnabled(true);
						t2.stop();
						sum1 = sum1 + n;
						if (sum1 >= 36) {
							sum1 = sum1 - 36;
						}
						if (sum1 == 9) {
							int pl1 = 0;
							for (int gc = 1; gc < 36; gc++) {
								if (((LineBorder) nation[gc].getBorder()).getLineColor()
										.equals(Color.lightGray) == false
										&& ((LineBorder) nation[gc].getBorder()).getLineColor()
												.equals(Color.black) == false) {
									pl1++;
								}

							}
							if (pl1 == 0) {
								Object[] option = { "確認" };
								int costy = JOptionPane.showOptionDialog(null, "沒有國家可以被北韓摧毀!!!", "北韓",
										JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option,
										option[0]);

							}
							if (pl1 > 0) {
								nsr = ns.nextInt(35) + 1;
								while (((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.black)
										|| ((LineBorder) nation[nsr].getBorder()).getLineColor()
												.equals(Color.lightGray)) {
									nsr = ns.nextInt(35) + 1;
									if (((LineBorder) nation[nsr].getBorder()).getLineColor()
											.equals(Color.black) == false
											&& ((LineBorder) nation[nsr].getBorder()).getLineColor()
													.equals(Color.lightGray) == false) {
										break;
									}
								}
								if (((LineBorder) nation[nsr].getBorder()).getLineColor()
										.equals(Color.lightGray) == false) {
									Object[] option = { "確認" };
									int costy = JOptionPane.showOptionDialog(null,
											"北韓發射核彈把" + nation[nsr].getText() + "摧毀了!!!", "北韓",
											JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option,
											option[0]);
									if (costy == JOptionPane.YES_OPTION) {

										nation[nsr].setBorder(new LineBorder(Color.lightGray, 3));
									}
								}
							}
						}
						if (sum1 == 18) {
							Object[] option = { "確認" };
							int plane = JOptionPane.showOptionDialog(null, "要飛去哪裡", "機場", JOptionPane.DEFAULT_OPTION,
									JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
							if (plane == JOptionPane.YES_OPTION) {

								Dice.setEnabled(false);

								for (int i = 0; i < 18; i++) {
									(nation[i]).setVisible(false);
									(nationp[i]).setVisible(true);
								}
								for (int i = 19; i < 36; i++) {
									(nation[i]).setVisible(false);
									(nationp[i]).setVisible(true);
								}

								nationp[0].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 18;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[1].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = -1;
										l = 19;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[2].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = -1;
										l = 20;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[3].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 21;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[4].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 22;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[5].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 23;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[6].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 24;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[7].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 25;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[8].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 26;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[9].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 27;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[10].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 28;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[11].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 29;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[12].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 30;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[13].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 31;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[14].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 32;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[15].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 33;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[16].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 34;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[17].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 35;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[19].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 1;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[20].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 2;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[21].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 3;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[22].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 4;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[23].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 5;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[24].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 6;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[25].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 7;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[26].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 8;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[27].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 9;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[28].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 10;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[29].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 11;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[30].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 12;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[31].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 13;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[32].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 14;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[33].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 15;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[34].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 16;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});
								nationp[35].addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent a) {
										n = 0;
										l = 17;
										Dice.setEnabled(false);
										t2.start();
										for (int i = 0; i < 36; i++) {
											(nationp[i]).setVisible(false);
											(nation[i]).setVisible(true);
										}
									}
								});

							}
						}
						if (sum1 == 27) {
							Object[] option = { "確認" };
							int costy = JOptionPane.showOptionDialog(null, "國稅局徵收$" + ys / 10 + "奢侈稅", "國稅局",
									JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
							if (costy == JOptionPane.YES_OPTION) {
								ys = ys - ys / 10;
								infoys.setText("$" + ys);
							}
						}

						if (sum1 != 0 && sum1 != 4 && sum1 != 9 && sum1 != 13 && sum1 != 18 && sum1 != 22 && sum1 != 27
								&& sum1 != 32) {
							g1 = Integer.valueOf(p[sum1].getText());
							if (((LineBorder) nation[sum1].getBorder()).getLineColor().equals(Color.green)) {
								int fff = g1 / 2;
								ys -= fff;
								gs += fff;
								g1 = g1 * 2;
							}
							if (((LineBorder) nation[sum1].getBorder()).getLineColor().equals(Color.blue)) {
								int fff = g1 / 2;
								ys -= fff;
								bs += fff;
								g1 = g1 * 2;
							}
							if (((LineBorder) nation[sum1].getBorder()).getLineColor().equals(Color.red)) {
								int fff = g1 / 2;
								ys -= fff;
								rs += fff;
								g1 = g1 * 2;
							}
							Object[] option = { "是", "否" };
							if (((LineBorder) nation[sum1].getBorder()).getLineColor().equals(Color.yellow)) {
								buy1 = JOptionPane.showOptionDialog(null, "$" + g1 / 2 + "\n是否加蓋一層房屋?", "購買",
										JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option,
										option[0]);
								if (buy1 == JOptionPane.YES_OPTION) {
									ys = ys - g1 / 2;
									p[sum1].setText("" + g1 * 2);
									lvit[sum1]++;
									lv[sum1].setText("lv." + lvit[sum1]);
									;
								}
								if (buy1 == JOptionPane.NO_OPTION) {
								}
							}
							if (((LineBorder) nation[sum1].getBorder()).getLineColor().equals(Color.yellow) == false) {
								buy1 = JOptionPane.showOptionDialog(null, "$" + g1 + "\n是否購買?", "購買",
										JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option,
										option[0]);
								if (buy1 == JOptionPane.YES_OPTION) {
									if (((LineBorder) nation[sum1].getBorder()).getLineColor().equals(Color.green)) {
										gs += g2;
									}
									if (((LineBorder) nation[sum1].getBorder()).getLineColor().equals(Color.red)) {
										rs += g2;
									}
									if (((LineBorder) nation[sum1].getBorder()).getLineColor().equals(Color.blue)) {
										bs += g2;
									}
									nation[sum1].setBorder(new LineBorder(Color.yellow, 5));
									ys = ys - g1;
									infobs.setText("$" + bs);
									infoys.setText("$" + ys);
									infors.setText("$" + rs);
									infogs.setText("$" + gs);
								}
								if (buy1 == JOptionPane.NO_OPTION) {
									infobs.setText("$" + bs);
									infoys.setText("$" + ys);
									infors.setText("$" + rs);
									infogs.setText("$" + gs);
								}
							}

						}
						if (sum1 == 4 || sum1 == 22) {
							o1 = opp.nextInt(2);
							switch (o1) {
							case 0:
								int s1 = r.nextInt(4) + 1;
								Object[] option0 = { "確認" };
								int f0 = JOptionPane.showOptionDialog(null, "前進" + s1 + "步", "命運",
										JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option0,
										option0[0]);
								if (f0 == JOptionPane.YES_OPTION) {
									n = 0;
									l = s1;
									Dice.setEnabled(false);
									t2.start();
									System.out.print(n);
								}
								break;
							case 1:
								int s2 = r.nextInt(4) + 1;
								Object[] option1 = { "確認" };
								int f1 = JOptionPane.showOptionDialog(null, "後退" + s2 + "步", "命運",
										JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1,
										option1[0]);
								n = 0;
								l = -s2;
								System.out.println(l);
								Dice.setEnabled(false);
								t2.start();
								break;
							case 2:
								Object[] option2 = { "確認" };
								int f2 = JOptionPane.showOptionDialog(null, "遭遇搶劫損失$10000", "命運",
										JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option2,
										option2[0]);
								ys -= 10000;
								infoys.setText("$" + ys);
								break;
							case 3:
								Object[] option3 = { "確認" };
								int f3 = JOptionPane.showOptionDialog(null, "這是你的生日，向每人收取禮金2500元", "命運",
										JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3,
										option3[0]);
								ys += 7500;
								bs -= 2500;
								gs -= 2500;
								rs -= 2500;
								infobs.setText("$" + bs);
								infoys.setText("$" + ys);
								infors.setText("$" + rs);
								infogs.setText("$" + gs);
								break;
							case 4:
								Object[] option4 = { "確認" };
								int f4 = JOptionPane.showOptionDialog(null, "中樂透獲得20000元", "命運",
										JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option4,
										option4[0]);
								ys += 20000;
								infoys.setText("$" + ys);
								break;
							case 5:
								Object[] option5 = { "確認" };
								int f5 = JOptionPane.showOptionDialog(null, "收稅囉!!", "命運", JOptionPane.DEFAULT_OPTION,
										JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
								int pl1 = 0;
								for (int i = 1; i < 36; i++) {
									if (((LineBorder) nation[i].getBorder()).getLineColor().equals(Color.yellow)) {
										pl1++;
									}
								}
								if (pl1 == 0) {

								}
								ys = ys - (pl1 * 1000);
								int f6 = JOptionPane.showOptionDialog(null, "損失了" + pl1 * 1000 + "元", "命運",
										JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option5,
										option5[0]);
								infoys.setText("$" + ys);
								break;
							}
						}
						if (sum1 == 13 || sum1 == 32) {
							o2 = opp.nextInt(6);
							switch (o2) {
							case 0:
								Object[] option0 = { "確認" };
								int f0 = JOptionPane.showOptionDialog(null, "繳赴美留學保證金，5000元", "機會",
										JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option0,
										option0[0]);
								ys -= 5000;
								infoys.setText("$" + ys);
								break;
							case 1:
								Object[] option1 = { "確認" };
								int f = JOptionPane.showOptionDialog(null, "酗酒鬧事，罰款5250元", "機會",
										JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1,
										option1[0]);
								ys -= 5250;
								infoys.setText("$" + ys);
								break;
							case 2:
								Object[] option2 = { "確認" };
								int f2 = JOptionPane.showOptionDialog(null, "路不拾遺失主酬勞，得8250元", "機會",
										JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option2,
										option2[0]);
								ys += 8250;
								infoys.setText("$" + ys);
								break;
							case 3:
								Object[] option3 = { "確認" };
								int f3 = JOptionPane.showOptionDialog(null, "選美得到了亞軍，得6000元", "機會",
										JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3,
										option3[0]);
								ys += 6000;
								infoys.setText("$" + ys);
								break;
							case 4:
								Object[] option4 = { "確認" };
								int f4 = JOptionPane.showOptionDialog(null, "股市盤跌，損失15000元", "機會",
										JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option4,
										option4[0]);
								ys -= 15000;
								infoys.setText("$" + ys);
								break;
							case 5:
								Object[] option5 = { "確認" };
								int f5 = JOptionPane.showOptionDialog(null, "在路上撿到7500元", "機會",
										JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option5,
										option5[0]);
								ys += 7500;
								infoys.setText("$" + ys);
								break;
							}
						}
						infoy.setBorder(new LineBorder(Color.lightGray, 5));
						infob.setBorder(new LineBorder(Color.blue, 5));
					}
				}
				if (ys < 0) {
					ys = 0;
					infogs.setText("$" + gs);
				}
				if (ys == 0) {
					Object[] option5 = { "確認" };
					int f5 = JOptionPane.showOptionDialog(null, "玩家1破產了!!!!!!", "大富翁", JOptionPane.DEFAULT_OPTION,
							JOptionPane.ERROR_MESSAGE, null, option5, option5[0]);
					Object[] option = { "重新遊戲", "離開" };
					int f = JOptionPane.showOptionDialog(null,
							"Game Over!!!\np1: " + ys + "\np2: " + bs + "\np3: " + gs + "\np4: " + rs, "大富翁",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
					if (f == JOptionPane.YES_OPTION) {
						lby.setBounds(4, 740, 50, 50);
						lby.setIcon(ch[0]);
						lbb.setBounds(24, 740, 50, 50);
						lbb.setIcon(ch[1]);
						lbg.setBounds(44, 740, 50, 50);
						lbg.setIcon(ch[2]);
						lbr.setBounds(64, 740, 50, 50);
						lbr.setIcon(ch[3]);
						ys = 50000;
						bs = 50000;
						gs = 50000;
						rs = 50000;
						infoys.setText("$" + ys);
						infobs.setText("$" + bs);
						infogs.setText("$" + gs);
						infors.setText("$" + rs);
						m = 0;
						sum1 = 0;
						for (int i = 0; i < 36; i++) {
							lvit[i] = 0;
						}
						for (int gc = 1; gc < 36; gc++) {
							if (((LineBorder) nation[gc].getBorder()).getLineColor().equals(Color.lightGray) == false
									&& ((LineBorder) nation[gc].getBorder()).getLineColor()
											.equals(Color.black) == false) {
								nation[gc].setBorder(new LineBorder(Color.lightGray, 3));
							}

						}
					}
					if (f == JOptionPane.NO_OPTION) {
						System.exit(0);
					}
				}
			}
		});

		t3 = new Timer(350, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (l < 0) {
					if (lbb.getX() == 24 && lbb.getY() > 80) {
						lbb.setLocation(lbb.getX(), lbb.getY() + 80);
					} else if (lby.getX() < 744 && lbb.getY() == 20) {
						lbb.setLocation(lbb.getX() - 80, (lbb.getY()));
					} else if (lbb.getX() == 744 && lbb.getY() < 740) {
						lbb.setLocation(lbb.getX(), lbb.getY() - 80);
					} else if (lbb.getX() > 24 && lbb.getY() == 740) {
						lbb.setLocation(lbb.getX() + 80, lbb.getY());
					}
					n--;
				} else {
					if (lbb.getX() == 24 && lbb.getY() > 80) {
						lbb.setLocation(lbb.getX(), lbb.getY() - 80);
					} else if (lbb.getX() < 744 && lbb.getY() == 20) {
						lbb.setLocation(lbb.getX() + 80, (lbb.getY()));
					} else if (lbb.getX() == 744 && lbb.getY() < 740) {
						lbb.setLocation(lbb.getX(), lbb.getY() + 80);
					} else if (lbb.getX() > 24 && lbb.getY() == 740) {
						lbb.setLocation(lbb.getX() - 80, lbb.getY());
					}
					n++;
				}
				if (lbb.getX() == 24 && lbb.getY() == 740) {
					Object[] option = { "確認" };
					int salary = JOptionPane.showOptionDialog(null, "獲得$22000", "薪水", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
					if (salary == JOptionPane.YES_OPTION) {
						bs = bs + 22000;
						infobs.setText("$" + bs);
					}
				}

				if (n == l) {
					Dice.setEnabled(true);
					t3.stop();
					sum2 = sum2 + n;
					if (sum2 >= 36) {
						sum2 = sum2 - 36;
					}
					if (sum2 == 9) {
						nsr = ns.nextInt(35) + 1;
						int pl1 = 0;
						for (int gc = 1; gc < 36; gc++) {
							if (((LineBorder) nation[gc].getBorder()).getLineColor().equals(Color.lightGray) == false
									&& ((LineBorder) nation[gc].getBorder()).getLineColor()
											.equals(Color.black) == false) {
								pl1++;
							}

						}
						if (pl1 == 0) {
							Object[] option = { "確認" };
							int costy = JOptionPane.showOptionDialog(null, "沒有國家可以被北韓摧毀!!!", "北韓",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option,
									option[0]);

						}
						if (pl1 > 0) {
							nsr = ns.nextInt(35) + 1;
							while (((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.black)
									|| ((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.lightGray)) {
								nsr = ns.nextInt(35) + 1;
								if (((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.black) == false
										&& ((LineBorder) nation[nsr].getBorder()).getLineColor()
												.equals(Color.lightGray) == false) {
									break;
								}
							}
							if (((LineBorder) nation[nsr].getBorder()).getLineColor()
									.equals(Color.lightGray) == false) {
								Object[] option = { "確認" };
								int costy = JOptionPane.showOptionDialog(null,
										"北韓發射核彈把" + nation[nsr].getText() + "摧毀了!!!", "北韓", JOptionPane.DEFAULT_OPTION,
										JOptionPane.WARNING_MESSAGE, null, option, option[0]);
								if (costy == JOptionPane.YES_OPTION) {

									nation[nsr].setBorder(new LineBorder(Color.lightGray, 3));
								}
							}
						}
					}
					if (sum2 == 18) {
						Object[] option = { "確認" };
						int plane = JOptionPane.showOptionDialog(null, "要飛去哪裡", "機場", JOptionPane.DEFAULT_OPTION,
								JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
						if (plane == JOptionPane.YES_OPTION) {

							Dice.setEnabled(false);

							for (int i = 0; i < 18; i++) {
								(nation[i]).setVisible(false);
								(nationp[i]).setVisible(true);
							}
							for (int i = 19; i < 36; i++) {
								(nation[i]).setVisible(false);
								(nationp[i]).setVisible(true);
							}

							nationp[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 18;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = -1;
									l = 19;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = -1;
									l = 20;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 21;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 22;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 23;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 24;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 25;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 26;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[9].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 27;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[10].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 28;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[11].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 29;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[12].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 30;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[13].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 31;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[14].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 32;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[15].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 33;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[16].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 34;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[17].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 35;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[18].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 36;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[19].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 1;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[20].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 2;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[21].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 3;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[22].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 4;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[23].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 5;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[24].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 6;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[25].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 7;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[26].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 8;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[27].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 9;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[28].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 10;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[29].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 11;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[30].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 12;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[31].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 13;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[32].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 14;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[33].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 15;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[34].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 16;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[35].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 17;
									Dice.setEnabled(false);
									t3.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});

						}
					}

					if (sum2 == 27) {
						Object[] option = { "確認" };
						int costb = JOptionPane.showOptionDialog(null, "國稅局徵收$" + bs / 10 + "奢侈稅", "國稅局",
								JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
						if (costb == JOptionPane.YES_OPTION) {
							bs = bs - bs / 10;
							infobs.setText("$" + bs);
						}
					}
					if (sum2 != 0 && sum2 != 4 && sum2 != 9 && sum2 != 13 && sum2 != 18 && sum2 != 22 && sum2 != 27
							&& sum2 != 32) {
						g2 = Integer.valueOf(p[sum2].getText());
						if (((LineBorder) nation[sum2].getBorder()).getLineColor().equals(Color.green)) {
							int fff = g2 / 2;
							bs -= fff;
							gs += fff;
							g2 = g2 * 2;
						}
						if (((LineBorder) nation[sum2].getBorder()).getLineColor().equals(Color.red)) {
							int fff = g2 / 2;
							bs -= fff;
							rs += fff;
							g2 = g2 * 2;
						}
						if (((LineBorder) nation[sum2].getBorder()).getLineColor().equals(Color.yellow)) {
							int fff = g2 / 2;
							bs -= fff;
							ys += fff;
							g2 = g2 * 2;
						}

						Object[] option = { "是", "否" };
						if (((LineBorder) nation[sum2].getBorder()).getLineColor().equals(Color.blue)) {
							buy1 = JOptionPane.showOptionDialog(null, "$" + g2 / 2 + "\n是否加蓋一層房屋?", "購買",
									JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
							if (buy1 == JOptionPane.YES_OPTION) {
								bs = bs - g2 / 2;
								p[sum2].setText("" + g2 * 2);
								lvit[sum2]++;
								lv[sum2].setText("lv." + lvit[sum2]);
								;
							}
							if (buy1 == JOptionPane.NO_OPTION) {
							}
						}
						if (((LineBorder) nation[sum2].getBorder()).getLineColor().equals(Color.blue) == false) {
							buy2 = JOptionPane.showOptionDialog(null, "$" + g2 + "\n是否購買?", "購買",
									JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
							if (buy2 == JOptionPane.YES_OPTION) {
								if (((LineBorder) nation[sum2].getBorder()).getLineColor().equals(Color.green)) {
									gs += g2;
								}
								if (((LineBorder) nation[sum2].getBorder()).getLineColor().equals(Color.red)) {
									rs += g2;
								}
								if (((LineBorder) nation[sum2].getBorder()).getLineColor().equals(Color.yellow)) {
									ys += g2;
								}
								nation[sum2].setBorder(new LineBorder(Color.blue, 5));
								bs = bs - g2;
								infobs.setText("$" + bs);
								infoys.setText("$" + ys);
								infors.setText("$" + rs);
								infogs.setText("$" + gs);
							}
							if (buy2 == JOptionPane.NO_OPTION) {
								infobs.setText("$" + bs);
								infoys.setText("$" + ys);
								infors.setText("$" + rs);
								infogs.setText("$" + gs);
							}
						}
					}
					if (sum2 == 4 || sum2 == 22) {
						o1 = fate.nextInt(2);
						switch (o1) {
						case 0:
							int s1 = r.nextInt(4) + 1;
							Object[] option0 = { "確認" };
							int f0 = JOptionPane.showOptionDialog(null, "前進" + s1 + "步", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option0,
									option0[0]);
							n = 0;
							l = s1;
							Dice.setEnabled(false);
							t3.start();
							break;
						case 1:
							int s2 = r.nextInt(4) + 1;
							Object[] option1 = { "確認" };
							int f1 = JOptionPane.showOptionDialog(null, "後退" + s2 + "步", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1,
									option1[0]);
							n = 0;
							l = -s2;
							Dice.setEnabled(false);
							t3.start();
							break;
						case 2:
							Object[] option2 = { "確認" };
							int f2 = JOptionPane.showOptionDialog(null, "遭遇搶劫損失$10000", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option2, option2[0]);
							bs -= 10000;
							infobs.setText("$" + bs);
							break;
						case 3:
							Object[] option3 = { "確認" };
							int f3 = JOptionPane.showOptionDialog(null, "這是你的生日，向每人收取禮金2500元", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3,
									option3[0]);
							ys -= 2500;
							bs += 7500;
							gs -= 2500;
							rs -= 2500;
							infobs.setText("$" + bs);
							infoys.setText("$" + ys);
							infors.setText("$" + rs);
							infogs.setText("$" + gs);
							break;
						case 4:
							Object[] option4 = { "確認" };
							int f4 = JOptionPane.showOptionDialog(null, "中樂透獲得20000元", "命運", JOptionPane.DEFAULT_OPTION,
									JOptionPane.INFORMATION_MESSAGE, null, option4, option4[0]);
							bs += 20000;
							infobs.setText("$" + bs);
							break;
						case 5:
							Object[] option5 = { "確認" };
							int f5 = JOptionPane.showOptionDialog(null, "收稅囉!!", "命運", JOptionPane.DEFAULT_OPTION,
									JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
							int pl1 = 0;
							for (int i = 1; i < 36; i++) {
								if (((LineBorder) nation[i].getBorder()).getLineColor().equals(Color.blue)) {
									pl1++;
								}
							}
							if (pl1 == 0) {

							}
							bs = bs - (pl1 * 1000);
							int f6 = JOptionPane.showOptionDialog(null, "損失了" + pl1 * 1000 + "元", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
							infobs.setText("$" + bs);
							break;
						}
					} else if (sum2 == 13 || sum2 == 32) {
						o2 = opp.nextInt(6);
						switch (o2) {
						case 0:
							Object[] option0 = { "確認" };
							int f0 = JOptionPane.showOptionDialog(null, "繳赴美留學保證金，5000元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option0,
									option0[0]);
							bs -= 5000;
							infobs.setText("$" + bs);
							break;
						case 1:
							Object[] option1 = { "確認" };
							int f = JOptionPane.showOptionDialog(null, "酗酒鬧事，罰款5250元", "機會", JOptionPane.DEFAULT_OPTION,
									JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);
							bs -= 5250;
							infobs.setText("$" + bs);
							break;
						case 2:
							Object[] option2 = { "確認" };
							int f2 = JOptionPane.showOptionDialog(null, "路不拾遺失主酬勞，得8250元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option2, option2[0]);
							bs += 8250;
							infobs.setText("$" + bs);
							break;
						case 3:
							Object[] option3 = { "確認" };
							int f3 = JOptionPane.showOptionDialog(null, "選美得到了亞軍，得6000元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3,
									option3[0]);
							bs += 6000;
							infobs.setText("$" + bs);
							break;
						case 4:
							Object[] option4 = { "確認" };
							int f4 = JOptionPane.showOptionDialog(null, "股市盤跌，損失15000元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option4,
									option4[0]);
							bs -= 15000;
							infobs.setText("$" + bs);
							break;
						case 5:
							Object[] option5 = { "確認" };
							int f5 = JOptionPane.showOptionDialog(null, "在路上撿到7500元", "機會", JOptionPane.DEFAULT_OPTION,
									JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
							bs += 7500;
							infobs.setText("$" + bs);
							break;
						}
					}
					infob.setBorder(new LineBorder(Color.lightGray, 5));
					infog.setBorder(new LineBorder(Color.green, 5));
				}
				if (bs < 0) {
					bs = 0;
					infobs.setText("$" + bs);
				}
				if (bs == 0) {
					Object[] option5 = { "確認" };
					int f5 = JOptionPane.showOptionDialog(null, "玩家1破產了!!!!!!", "大富翁", JOptionPane.DEFAULT_OPTION,
							JOptionPane.ERROR_MESSAGE, null, option5, option5[0]);
					Object[] option = { "重新遊戲", "離開" };
					int f = JOptionPane.showOptionDialog(null,
							"Game Over!!!\np1: " + ys + "\np2: " + bs + "\np3: " + gs + "\np4: " + rs, "大富翁",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
					if (f == JOptionPane.YES_OPTION) {
						lby.setBounds(4, 740, 50, 50);
						lby.setIcon(ch[0]);
						lbb.setBounds(24, 740, 50, 50);
						lbb.setIcon(ch[1]);
						lbg.setBounds(44, 740, 50, 50);
						lbg.setIcon(ch[2]);
						lbr.setBounds(64, 740, 50, 50);
						lbr.setIcon(ch[3]);
						ys = 50000;
						bs = 50000;
						gs = 50000;
						rs = 50000;
						infoys.setText("$" + ys);
						infobs.setText("$" + bs);
						infogs.setText("$" + gs);
						infors.setText("$" + rs);
						m = 0;
						sum2 = 0;
						for (int i = 0; i < 36; i++) {
							lvit[i] = 0;
						}
						for (int gc = 1; gc < 36; gc++) {
							if (((LineBorder) nation[gc].getBorder()).getLineColor().equals(Color.lightGray) == false
									&& ((LineBorder) nation[gc].getBorder()).getLineColor()
											.equals(Color.black) == false) {
								nation[gc].setBorder(new LineBorder(Color.lightGray, 3));
							}

						}
					}
					if (f == JOptionPane.NO_OPTION) {
						System.exit(0);
					}
				}
			}
		});
		t4 = new Timer(350, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (l < 0) {
					if (lbg.getX() == 44 && lbg.getY() > 80) {
						lbg.setLocation(lbg.getX(), lbg.getY() + 80);
					} else if (lbg.getX() < 764 && lbg.getY() == 20) {
						lbg.setLocation(lbg.getX() - 80, (lbg.getY()));
					} else if (lbg.getX() == 764 && lbg.getY() < 740) {
						lbg.setLocation(lbg.getX(), lbg.getY() - 80);
					} else if (lbg.getX() > 44 && lbg.getY() == 740) {
						lbg.setLocation(lbg.getX() + 80, lbg.getY());
					}
					n--;
				} else {
					if (lbg.getX() == 44 && lbg.getY() > 80) {
						lbg.setLocation(lbg.getX(), lbg.getY() - 80);
					} else if (lbg.getX() < 764 && lbg.getY() == 20) {
						lbg.setLocation(lbg.getX() + 80, (lbg.getY()));
					} else if (lbg.getX() == 764 && lbg.getY() < 740) {
						lbg.setLocation(lbg.getX(), lbg.getY() + 80);
					} else if (lbg.getX() > 44 && lbg.getY() == 740) {
						lbg.setLocation(lbg.getX() - 80, lbg.getY());
					}
					n++;
				}
				if (lbg.getX() == 44 && lbg.getY() == 740) {
					Object[] option = { "確認" };
					int salary = JOptionPane.showOptionDialog(null, "獲得$22000", "薪水", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
					if (salary == JOptionPane.YES_OPTION) {
						gs = gs + 22000;
						infogs.setText("$" + gs);
					}
				}
				if (n == l) {
					Dice.setEnabled(true);
					t4.stop();
					sum3 = sum3 + n;
					if (sum3 >= 36) {
						sum3 = sum3 - 36;
					}
					if (sum3 == 9) {
						int pl1 = 0;
						for (int gc = 1; gc < 36; gc++) {
							if (((LineBorder) nation[gc].getBorder()).getLineColor().equals(Color.lightGray) == false
									&& ((LineBorder) nation[gc].getBorder()).getLineColor()
											.equals(Color.black) == false) {
								pl1++;
							}

						}
						if (pl1 == 0) {
							Object[] option = { "確認" };
							int costy = JOptionPane.showOptionDialog(null, "沒有國家可以被北韓摧毀!!!", "北韓",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option,
									option[0]);

						}
						if (pl1 > 0) {
							nsr = ns.nextInt(35) + 1;
							while (((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.black)
									|| ((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.lightGray)) {
								nsr = ns.nextInt(35) + 1;
								if (((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.black) == false
										&& ((LineBorder) nation[nsr].getBorder()).getLineColor()
												.equals(Color.lightGray) == false) {
									break;
								}
							}
							if (((LineBorder) nation[nsr].getBorder()).getLineColor()
									.equals(Color.lightGray) == false) {
								Object[] option = { "確認" };
								int costy = JOptionPane.showOptionDialog(null,
										"北韓發射核彈把" + nation[nsr].getText() + "摧毀了!!!", "北韓", JOptionPane.DEFAULT_OPTION,
										JOptionPane.WARNING_MESSAGE, null, option, option[0]);
								if (costy == JOptionPane.YES_OPTION) {

									nation[nsr].setBorder(new LineBorder(Color.lightGray, 3));
								}
							}
						}
					}
					if (sum3 == 18) {
						Object[] option = { "確認" };
						int plane = JOptionPane.showOptionDialog(null, "要飛去哪裡", "機場", JOptionPane.DEFAULT_OPTION,
								JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
						if (plane == JOptionPane.YES_OPTION) {

							Dice.setEnabled(false);

							for (int i = 0; i < 18; i++) {
								(nation[i]).setVisible(false);
								(nationp[i]).setVisible(true);
							}
							for (int i = 19; i < 36; i++) {
								(nation[i]).setVisible(false);
								(nationp[i]).setVisible(true);
							}

							nationp[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 18;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 19;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 20;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 21;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 22;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 23;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 24;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 25;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 26;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[9].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 27;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[10].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 28;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[11].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 29;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[12].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 30;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[13].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 31;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[14].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 32;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[15].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 33;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[16].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 34;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[17].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 35;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[18].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 36;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[19].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 1;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[20].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 2;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[21].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 3;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[22].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 4;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[23].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 5;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[24].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 6;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[25].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 7;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[26].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 8;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[27].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 9;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[28].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 10;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[29].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 11;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[30].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 12;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[31].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 13;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[32].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 14;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[33].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 15;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[34].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 16;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[35].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 17;
									Dice.setEnabled(false);
									t4.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});

						}
					}
					if (sum3 == 27) {
						Object[] option = { "確認" };
						int costg = JOptionPane.showOptionDialog(null, "國稅局徵收$" + gs / 10 + "奢侈稅", "國稅局",
								JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
						if (costg == JOptionPane.YES_OPTION) {
							gs = gs - gs / 10;
							infogs.setText("$" + gs);
						}
					}
					if (sum3 != 0 && sum3 != 4 && sum3 != 9 && sum3 != 13 && sum3 != 18 && sum3 != 22 && sum3 != 27
							&& sum3 != 32) {
						g3 = Integer.valueOf(p[sum3].getText());
						if (((LineBorder) nation[sum3].getBorder()).getLineColor().equals(Color.yellow)) {
							int fff = g3 / 2;
							gs -= fff;
							ys += fff;
							g3 = g3 * 2;
						}
						if (((LineBorder) nation[sum3].getBorder()).getLineColor().equals(Color.blue)) {
							int fff = g3 / 2;
							gs -= fff;
							bs += fff;
							g3 = g3 * 2;
						}
						if (((LineBorder) nation[sum3].getBorder()).getLineColor().equals(Color.red)) {
							int fff = g3 / 2;
							gs -= fff;
							rs += fff;
							g3 = g3 * 2;
						}
						Object[] option = { "是", "否" };
						if (((LineBorder) nation[sum3].getBorder()).getLineColor().equals(Color.green)) {
							buy1 = JOptionPane.showOptionDialog(null, "$" + g3 / 2 + "\n是否加蓋一層房屋?", "購買",
									JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
							if (buy1 == JOptionPane.YES_OPTION) {
								gs = gs - g3 / 2;
								p[sum3].setText("" + g3 * 2);
								lvit[sum3]++;
								lv[sum3].setText("lv." + lvit[sum3]);
								;
							}
							if (buy1 == JOptionPane.NO_OPTION) {
							}
						}
						if (((LineBorder) nation[sum3].getBorder()).getLineColor().equals(Color.green) == false) {
							buy3 = JOptionPane.showOptionDialog(null, "$" + g3 + "\n是否購買?", "購買",
									JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
							if (buy3 == JOptionPane.YES_OPTION) {
								if (((LineBorder) nation[sum3].getBorder()).getLineColor().equals(Color.red)) {
									rs += g2;
								}
								if (((LineBorder) nation[sum3].getBorder()).getLineColor().equals(Color.yellow)) {
									ys += g2;
								}
								if (((LineBorder) nation[sum3].getBorder()).getLineColor().equals(Color.blue)) {
									bs += g2;
								}
								nation[sum3].setBorder(new LineBorder(Color.green, 5));
								gs = gs - g3;
								infobs.setText("$" + bs);
								infoys.setText("$" + ys);
								infors.setText("$" + rs);
								infogs.setText("$" + gs);
							}
							if (buy3 == JOptionPane.NO_OPTION) {
								infobs.setText("$" + bs);
								infoys.setText("$" + ys);
								infors.setText("$" + rs);
								infogs.setText("$" + gs);
							}
						}
					}
					if (sum3 == 4 || sum3 == 22) {
						o1 = fate.nextInt(2);
						switch (o1) {
						case 0:
							int s1 = r.nextInt(4) + 1;
							Object[] option0 = { "確認" };
							int f0 = JOptionPane.showOptionDialog(null, "前進" + s1 + "步", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option0,
									option0[0]);
							n = 0;
							l = s1;
							Dice.setEnabled(false);
							t4.start();
							break;
						case 1:
							int s2 = r.nextInt(4) + 1;
							Object[] option1 = { "確認" };
							int f1 = JOptionPane.showOptionDialog(null, "後退" + s2 + "步", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1,
									option1[0]);
							n = 0;
							l = -s2;
							Dice.setEnabled(false);
							t4.start();
							break;
						case 2:
							Object[] option2 = { "確認" };
							int f2 = JOptionPane.showOptionDialog(null, "遭遇搶劫損失$10000", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option2, option2[0]);
							gs -= 10000;
							infogs.setText("$" + gs);
							break;
						case 3:
							Object[] option3 = { "確認" };
							int f3 = JOptionPane.showOptionDialog(null, "這是你的生日，向每人收取禮金2500元", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3,
									option3[0]);
							ys -= 2500;
							bs -= 2500;
							gs += 7500;
							rs -= 2500;
							infobs.setText("$" + bs);
							infoys.setText("$" + ys);
							infors.setText("$" + rs);
							infogs.setText("$" + gs);
							break;
						case 4:
							Object[] option4 = { "確認" };
							int f4 = JOptionPane.showOptionDialog(null, "中樂透獲得20000元", "命運", JOptionPane.DEFAULT_OPTION,
									JOptionPane.INFORMATION_MESSAGE, null, option4, option4[0]);
							gs += 20000;
							infogs.setText("$" + gs);
							break;
						case 5:
							Object[] option5 = { "確認" };
							int f5 = JOptionPane.showOptionDialog(null, "收稅囉!!", "命運", JOptionPane.DEFAULT_OPTION,
									JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
							int pl1 = 0;
							for (int i = 1; i < 36; i++) {
								if (((LineBorder) nation[i].getBorder()).getLineColor().equals(Color.green)) {
									pl1++;
								}
							}
							if (pl1 == 0) {

							}
							gs = gs - (pl1 * 1000);
							int f6 = JOptionPane.showOptionDialog(null, "損失了" + pl1 * 1000 + "元", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
							infogs.setText("$" + gs);
							break;
						}
					}
					if (sum3 == 13 || sum3 == 32) {
						o2 = opp.nextInt(6);
						switch (o2) {
						case 0:
							Object[] option0 = { "確認" };
							int f0 = JOptionPane.showOptionDialog(null, "繳赴美留學保證金，5000元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option0,
									option0[0]);
							gs -= 5000;
							infogs.setText("$" + gs);
							break;
						case 1:
							Object[] option1 = { "確認" };
							int f = JOptionPane.showOptionDialog(null, "酗酒鬧事，罰款5250元", "機會", JOptionPane.DEFAULT_OPTION,
									JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);
							gs -= 5250;
							infogs.setText("$" + gs);
							break;
						case 2:
							Object[] option2 = { "確認" };
							int f2 = JOptionPane.showOptionDialog(null, "路不拾遺失主酬勞，得8250元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option2, option2[0]);
							gs += 8250;
							infogs.setText("$" + gs);
							break;
						case 3:
							Object[] option3 = { "確認" };
							int f3 = JOptionPane.showOptionDialog(null, "選美得到了亞軍，得6000元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3,
									option3[0]);
							gs += 6000;
							infogs.setText("$" + gs);
							break;
						case 4:
							Object[] option4 = { "確認" };
							int f4 = JOptionPane.showOptionDialog(null, "股市盤跌，損失15000元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option4,
									option4[0]);
							gs -= 15000;
							infogs.setText("$" + gs);
							break;
						case 5:
							Object[] option5 = { "確認" };
							int f5 = JOptionPane.showOptionDialog(null, "在路上撿到7500元", "機會", JOptionPane.DEFAULT_OPTION,
									JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
							gs += 7500;
							infogs.setText("$" + gs);
							break;
						}
					}
					infog.setBorder(new LineBorder(Color.lightGray, 5));
					infor.setBorder(new LineBorder(Color.red, 5));
				}
				if (gs < 0) {
					gs = 0;
					infogs.setText("$" + gs);
				}
				if (gs == 0) {
					Object[] option5 = { "確認" };
					int f5 = JOptionPane.showOptionDialog(null, "玩家1破產了!!!!!!", "大富翁", JOptionPane.DEFAULT_OPTION,
							JOptionPane.ERROR_MESSAGE, null, option5, option5[0]);
					Object[] option = { "重新遊戲", "離開" };
					int f = JOptionPane.showOptionDialog(null,
							"Game Over!!!\np1: " + ys + "\np2: " + bs + "\np3: " + gs + "\np4: " + rs, "大富翁",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
					if (f == JOptionPane.YES_OPTION) {
						lby.setBounds(4, 740, 50, 50);
						lby.setIcon(ch[0]);
						lbb.setBounds(24, 740, 50, 50);
						lbb.setIcon(ch[1]);
						lbg.setBounds(44, 740, 50, 50);
						lbg.setIcon(ch[2]);
						lbr.setBounds(64, 740, 50, 50);
						lbr.setIcon(ch[3]);
						ys = 50000;
						bs = 50000;
						gs = 50000;
						rs = 50000;
						infoys.setText("$" + ys);
						infobs.setText("$" + bs);
						infogs.setText("$" + gs);
						infors.setText("$" + rs);
						m = 0;
						sum3 = 0;
						for (int i = 0; i < 36; i++) {
							lvit[i] = 0;
						}
						for (int gc = 1; gc < 36; gc++) {
							if (((LineBorder) nation[gc].getBorder()).getLineColor().equals(Color.lightGray) == false
									&& ((LineBorder) nation[gc].getBorder()).getLineColor()
											.equals(Color.black) == false) {
								nation[gc].setBorder(new LineBorder(Color.lightGray, 3));
							}

						}
					}
					if (f == JOptionPane.NO_OPTION) {
						System.exit(0);
					}
				}
			}
		});
		t5 = new Timer(350, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (l < 0) {
					if (lbr.getX() == 64 && lbr.getY() > 80) {
						lbr.setLocation(lbr.getX(), lbr.getY() + 80);
					} else if (lbr.getX() < 784 && lbr.getY() == 20) {
						lbr.setLocation(lbr.getX() - 80, (lbr.getY()));
					} else if (lbr.getX() == 784 && lbr.getY() < 740) {
						lbr.setLocation(lbr.getX(), lbr.getY() - 80);
					} else if (lbr.getX() > 64 && lbr.getY() == 740) {
						lbr.setLocation(lbr.getX() + 80, lbr.getY());
					}
					n--;
				} else {
					if (lbr.getX() == 64 && lbr.getY() > 80) {
						lbr.setLocation(lbr.getX(), lbr.getY() - 80);
					} else if (lbr.getX() < 784 && lbr.getY() == 20) {
						lbr.setLocation(lbr.getX() + 80, (lbr.getY()));
					} else if (lbr.getX() == 784 && lbr.getY() < 740) {
						lbr.setLocation(lbr.getX(), lbr.getY() + 80);
					} else if (lbr.getX() > 64 && lbr.getY() == 740) {
						lbr.setLocation(lbr.getX() - 80, lbr.getY());
					}
					n++;
				}
				if (lbr.getX() == 64 && lbr.getY() == 740) {
					Object[] option = { "確認" };
					int salary = JOptionPane.showOptionDialog(null, "獲得$22000", "薪水", JOptionPane.DEFAULT_OPTION,
							JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
					if (salary == JOptionPane.YES_OPTION) {
						rs = rs + 22000;
						infors.setText("$" + rs);
					}
				}
				if (n == l) {
					Dice.setEnabled(true);
					t5.stop();
					sum4 = sum4 + n;
					if (sum4 >= 36) {
						sum4 = sum4 - 36;
					}
					if (sum4 == 9) {
						int pl1 = 0;
						for (int gc = 1; gc < 36; gc++) {
							if (((LineBorder) nation[gc].getBorder()).getLineColor().equals(Color.lightGray) == false
									&& ((LineBorder) nation[gc].getBorder()).getLineColor()
											.equals(Color.black) == false) {
								pl1++;
							}

						}
						if (pl1 == 0) {
							Object[] option = { "確認" };
							int costy = JOptionPane.showOptionDialog(null, "沒有國家可以被北韓摧毀!!!", "北韓",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option,
									option[0]);

						}
						if (pl1 > 0) {
							nsr = ns.nextInt(35) + 1;
							while (((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.black)
									|| ((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.lightGray)) {
								nsr = ns.nextInt(35) + 1;
								if (((LineBorder) nation[nsr].getBorder()).getLineColor().equals(Color.black) == false
										&& ((LineBorder) nation[nsr].getBorder()).getLineColor()
												.equals(Color.lightGray) == false) {
									break;
								}
							}
							if (((LineBorder) nation[nsr].getBorder()).getLineColor()
									.equals(Color.lightGray) == false) {
								Object[] option = { "確認" };
								int costy = JOptionPane.showOptionDialog(null,
										"北韓發射核彈把" + nation[nsr].getText() + "摧毀了!!!", "北韓", JOptionPane.DEFAULT_OPTION,
										JOptionPane.WARNING_MESSAGE, null, option, option[0]);
								if (costy == JOptionPane.YES_OPTION) {

									nation[nsr].setBorder(new LineBorder(Color.lightGray, 3));
								}
							}
						}
					}
					if (sum4 == 18) {
						Object[] option = { "確認" };
						int plane = JOptionPane.showOptionDialog(null, "要飛去哪裡", "機場", JOptionPane.DEFAULT_OPTION,
								JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
						if (plane == JOptionPane.YES_OPTION) {

							Dice.setEnabled(false);

							for (int i = 0; i < 18; i++) {
								(nation[i]).setVisible(false);
								(nationp[i]).setVisible(true);
							}
							for (int i = 19; i < 36; i++) {
								(nation[i]).setVisible(false);
								(nationp[i]).setVisible(true);
							}

							nationp[0].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 18;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[1].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = -1;
									l = 19;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[2].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = -1;
									l = 20;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[3].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 21;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[4].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 22;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[5].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 23;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[6].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 24;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[7].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 25;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[8].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 26;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[9].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 27;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[10].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 28;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[11].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 29;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[12].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 30;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[13].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 31;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[14].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 32;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[15].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 33;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[16].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 34;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[17].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 35;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[18].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 36;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[19].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 1;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[20].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 2;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[21].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 3;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[22].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 4;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[23].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 5;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[24].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 6;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[25].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 7;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[26].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 8;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[27].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 9;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[28].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 10;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[29].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 11;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[30].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 12;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[31].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 13;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[32].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 14;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[33].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 15;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[34].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 16;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});
							nationp[35].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									n = 0;
									l = 17;
									Dice.setEnabled(false);
									t5.start();
									for (int i = 0; i < 36; i++) {
										(nationp[i]).setVisible(false);
										(nation[i]).setVisible(true);
									}
								}
							});

						}
					}
					if (sum4 == 27) {
						Object[] option = { "確認" };
						int costr = JOptionPane.showOptionDialog(null, "國稅局徵收$" + rs / 10 + "奢侈稅", "國稅局",
								JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, option[0]);
						if (costr == JOptionPane.YES_OPTION) {
							rs = rs - rs / 10;
							infors.setText("$" + rs);
						}
					}
					if (sum4 != 0 && sum4 != 4 && sum4 != 9 && sum4 != 13 && sum4 != 18 && sum4 != 22 && sum4 != 27
							&& sum4 != 32) {
						g4 = Integer.valueOf(p[sum4].getText());
						if (((LineBorder) nation[sum4].getBorder()).getLineColor().equals(Color.green)) {
							int fff = g4 / 2;
							rs -= fff;
							gs += fff;
							g4 = g4 * 2;
						}
						if (((LineBorder) nation[sum4].getBorder()).getLineColor().equals(Color.blue)) {
							int fff = g4 / 2;
							rs -= fff;
							bs += fff;
							g4 = g4 * 2;
						}
						if (((LineBorder) nation[sum4].getBorder()).getLineColor().equals(Color.yellow)) {
							int fff = g4 / 2;
							rs -= fff;
							ys += fff;
							g4 = g4 * 2;
						}
						Object[] option = { "是", "否" };
						if (((LineBorder) nation[sum4].getBorder()).getLineColor().equals(Color.red)) {
							buy1 = JOptionPane.showOptionDialog(null, "$" + g1 / 2 + "\n是否加蓋一層房屋?", "購買",
									JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
							if (buy1 == JOptionPane.YES_OPTION) {
								rs = rs - g4 / 2;
								p[sum4].setText("" + g4 * 2);
								lvit[sum4]++;
								lv[sum4].setText("lv." + lvit[sum4]);
								;
							}
							if (buy1 == JOptionPane.NO_OPTION) {
							}
						}
						if (((LineBorder) nation[sum4].getBorder()).getLineColor().equals(Color.red) == false) {
							buy4 = JOptionPane.showOptionDialog(null, "$" + g4 + "\n是否購買?", "購買",
									JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
							if (buy4 == JOptionPane.YES_OPTION) {
								if (((LineBorder) nation[sum4].getBorder()).getLineColor().equals(Color.green)) {
									gs += g2;
								}
								if (((LineBorder) nation[sum4].getBorder()).getLineColor().equals(Color.yellow)) {
									ys += g2;
								}
								if (((LineBorder) nation[sum4].getBorder()).getLineColor().equals(Color.blue)) {
									bs += g2;
								}
								nation[sum4].setBorder(new LineBorder(Color.red, 5));
								rs = rs - g4;
								infobs.setText("$" + bs);
								infoys.setText("$" + ys);
								infors.setText("$" + rs);
								infogs.setText("$" + gs);
							}
							if (buy4 == JOptionPane.NO_OPTION) {
								infobs.setText("$" + bs);
								infoys.setText("$" + ys);
								infors.setText("$" + rs);
								infogs.setText("$" + gs);
							}
						}
					}
					if (sum4 == 4 || sum4 == 22) {
						o1 = fate.nextInt(2);
						switch (o1) {
						case 0:
							int s1 = r.nextInt(4) + 1;
							Object[] option0 = { "確認" };
							int f0 = JOptionPane.showOptionDialog(null, "前進" + s1 + "步", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option0,
									option0[0]);
							n = 0;
							l = s1;
							Dice.setEnabled(false);
							t5.start();
							break;
						case 1:
							int s2 = r.nextInt(4) + 1;
							Object[] option1 = { "確認" };
							int f1 = JOptionPane.showOptionDialog(null, "後退" + s2 + "步", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1,
									option1[0]);
							n = 0;
							l = -s2;
							Dice.setEnabled(false);
							t5.start();
							break;
						case 2:
							Object[] option2 = { "確認" };
							int f2 = JOptionPane.showOptionDialog(null, "遭遇搶劫損失$10000", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option2, option2[0]);
							rs -= 10000;
							infors.setText("$" + rs);
							break;
						case 3:
							Object[] option3 = { "確認" };
							int f3 = JOptionPane.showOptionDialog(null, "這是你的生日，向每人收取禮金2500元", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3,
									option3[0]);
							ys -= 2500;
							bs -= 2500;
							gs -= 2500;
							rs += 7500;
							infobs.setText("$" + bs);
							infoys.setText("$" + ys);
							infors.setText("$" + rs);
							infogs.setText("$" + gs);
							break;
						case 4:
							Object[] option4 = { "確認" };
							int f4 = JOptionPane.showOptionDialog(null, "中樂透獲得20000元", "命運", JOptionPane.DEFAULT_OPTION,
									JOptionPane.INFORMATION_MESSAGE, null, option4, option4[0]);
							rs += 20000;
							infors.setText("$" + rs);
							break;
						case 5:
							Object[] option5 = { "確認" };
							int f5 = JOptionPane.showOptionDialog(null, "收稅囉!!", "命運", JOptionPane.DEFAULT_OPTION,
									JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
							int pl1 = 0;
							for (int i = 1; i < 36; i++) {
								if (((LineBorder) nation[i].getBorder()).getLineColor().equals(Color.red)) {
									pl1++;
								}

							}
							if (pl1 == 0) {

							}
							rs = rs - (pl1 * 1000);
							int f6 = JOptionPane.showOptionDialog(null, "損失了" + pl1 * 1000 + "元", "命運",
									JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
							infors.setText("$" + rs);
							break;
						}
					}
					if (sum4 == 13 || sum4 == 32) {
						o2 = opp.nextInt(6);
						switch (o2) {
						case 0:
							Object[] option0 = { "確認" };
							int f0 = JOptionPane.showOptionDialog(null, "繳赴美留學保證金，5000元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option0,
									option0[0]);
							rs -= 5000;
							infors.setText("$" + rs);
							break;
						case 1:
							Object[] option1 = { "確認" };
							int f = JOptionPane.showOptionDialog(null, "酗酒鬧事，罰款5250元", "機會", JOptionPane.DEFAULT_OPTION,
									JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);
							rs -= 5250;
							infors.setText("$" + rs);
							break;
						case 2:
							Object[] option2 = { "確認" };
							int f2 = JOptionPane.showOptionDialog(null, "路不拾遺失主酬勞，得8250元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, option2, option2[0]);
							rs += 8250;
							infors.setText("$" + rs);
							break;
						case 3:
							Object[] option3 = { "確認" };
							int f3 = JOptionPane.showOptionDialog(null, "選美得到了亞軍，得6000元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option3,
									option3[0]);
							rs += 6000;
							infors.setText("$" + rs);
							break;
						case 4:
							Object[] option4 = { "確認" };
							int f4 = JOptionPane.showOptionDialog(null, "股市盤跌，損失15000元", "機會",
									JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option4,
									option4[0]);
							rs -= 15000;
							infors.setText("$" + rs);
							break;
						case 5:
							Object[] option5 = { "確認" };
							int f5 = JOptionPane.showOptionDialog(null, "在路上撿到7500元", "機會", JOptionPane.DEFAULT_OPTION,
									JOptionPane.WARNING_MESSAGE, null, option5, option5[0]);
							rs += 7500;
							infors.setText("$" + rs);
							break;
						}
					}
					infor.setBorder(new LineBorder(Color.lightGray, 5));
					infoy.setBorder(new LineBorder(Color.yellow, 5));
				}
				if (rs < 0) {
					rs = 0;
					infors.setText("$" + rs);
				}
				if (rs == 0) {
					Object[] option5 = { "確認" };
					int f5 = JOptionPane.showOptionDialog(null, "玩家1破產了!!!!!!", "大富翁", JOptionPane.DEFAULT_OPTION,
							JOptionPane.ERROR_MESSAGE, null, option5, option5[0]);
					Object[] option = { "重新遊戲", "離開" };
					int f = JOptionPane.showOptionDialog(null,
							"Game Over!!!\np1: " + ys + "\np2: " + bs + "\np3: " + gs + "\np4: " + rs, "大富翁",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
					if (f == JOptionPane.YES_OPTION) {
						lby.setBounds(4, 740, 50, 50);
						lby.setIcon(ch[0]);
						lbb.setBounds(24, 740, 50, 50);
						lbb.setIcon(ch[1]);
						lbg.setBounds(44, 740, 50, 50);
						lbg.setIcon(ch[2]);
						lbr.setBounds(64, 740, 50, 50);
						lbr.setIcon(ch[3]);
						ys = 50000;
						bs = 50000;
						gs = 50000;
						rs = 50000;
						infoys.setText("$" + ys);
						infobs.setText("$" + bs);
						infogs.setText("$" + gs);
						infors.setText("$" + rs);
						m = 0;
						sum4 = 0;
						for (int i = 0; i < 36; i++) {
							lvit[i] = 0;
						}
						for (int gc = 1; gc < 36; gc++) {
							if (((LineBorder) nation[gc].getBorder()).getLineColor().equals(Color.lightGray) == false
									&& ((LineBorder) nation[gc].getBorder()).getLineColor()
											.equals(Color.black) == false) {
								nation[gc].setBorder(new LineBorder(Color.lightGray, 3));
							}

						}
					}
					if (f == JOptionPane.NO_OPTION) {
						System.exit(0);
					}
				}
			}
		});

		this.setLayout(null);
		this.setSize(1300, 900);
		this.setLocation(200, 0);
		this.setResizable(false);
		Dice.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t1.start();
				m++;
				n = 0;
				l = 0;
				if (m == 5) {
					m = 1;
				}
			}
		});

		Dice.setBounds(500, 250, 100, 100);
		rule.setBounds(803, 40, 500, 700);
		rule.setLineWrap(true);// 自動換行
		rule.setText(
				"遊戲人數：4人\n\n 金錢：50k\n\n遊戲進行：每個玩家選擇一個代表棋子放在起點上。擲骰子決定先後次序，點數大的玩家先行，之後再以順時針方向進行。\n\n玩家擲出骰子，按擲出的點數前行，如非特別指定，所有移動都是以順時針方向進行。當棋子到達土地上，如土地是空置的玩家可以選擇購買，或要向土地的擁有者繳付租金。\n\n如果要購買別人的地需付兩倍金錢\n\n如停在「機會」或「命運」會觸發一些事件。\n\n當棋子再次經過或停留在起點，玩家可獲得22000元。 \n\n勝負：當玩家不夠錢支付需要繳付的金錢時，玩家宣佈破產退出遊戲最後一位未破產的玩家就是遊戲的勝利者。");
		rule.setFont(new Font("Serief", Font.BOLD, 13));
		rule.setEditable(false);// 執行時使玩家無法於textarea修改內容
		lab00.setText("   大    富    翁");
		;
		lab00.setForeground(Color.blue);
		lab00.setLocation(50, 96);
		lab00.setSize(800, 180);

		lab01.setText("     環遊世界");
		lab01.setForeground(Color.blue);
		lab01.setLocation(50, 410);
		lab01.setSize(800, 150);
		// ---------------------------------------人物------------------------
		lby.setBounds(4, 740, 50, 50);
		lby.setIcon(ch[0]);

		lbb.setBounds(24, 740, 50, 50);
		lbb.setIcon(ch[1]);

		lbg.setBounds(44, 740, 50, 50);
		lbg.setIcon(ch[2]);

		lbr.setBounds(64, 740, 50, 50);
		lbr.setIcon(ch[3]);
		Font fnts = new Font("Serief", Font.ITALIC + Font.BOLD, 24);
		infoy.setBounds(175, 550, 110, 205);
		infoy.setIcon(info[0]);
		infoy.setBorder(new LineBorder(Color.yellow, 5));
		infob.setBounds(290, 550, 110, 205);
		infob.setIcon(info[1]);
		infob.setBorder(new LineBorder(Color.lightGray, 5));
		infog.setBounds(405, 550, 110, 205);
		infog.setIcon(info[2]);
		infog.setBorder(new LineBorder(Color.lightGray, 5));
		infor.setBounds(520, 550, 110, 205);
		infor.setIcon(info[3]);
		infor.setBorder(new LineBorder(Color.lightGray, 5));
		infoys.setBounds(182, 600, 110, 205);
		infoys.setText("$" + ys);
		infoys.setFont(fnts);
		infobs.setBounds(296, 600, 110, 205);
		infobs.setText("$" + bs);
		infobs.setFont(fnts);
		infogs.setBounds(412, 600, 110, 205);
		infogs.setText("$" + gs);
		infogs.setFont(fnts);
		infors.setBounds(527, 600, 110, 205);
		infors.setText("$" + rs);
		infors.setFont(fnts);
		// ---------------------------------------人物------------------------

		// ---------------------------------------骰子------------------------
		dice1.setLocation(300, 250);
		dice1.setSize(100, 100);
		dice1.setIcon(img[0]);
		dice2.setLocation(400, 250);
		dice2.setSize(100, 100);
		dice2.setIcon(img[0]);

		labDice.setForeground(Color.blue);
		labDice.setLocation(325, 370);
		labDice.setSize(200, 40);
		// ---------------------------------------骰子------------------------

		p[0].setBounds(28, 820, 50, 10);
		p[1].setBounds(28, 739, 50, 10);
		p[2].setBounds(28, 659, 50, 10);
		p[3].setBounds(28, 579, 50, 10);
		p[4].setBounds(28, 499, 50, 10);
		p[5].setBounds(28, 419, 50, 10);
		p[6].setBounds(28, 339, 50, 10);
		p[7].setBounds(28, 259, 50, 10);
		p[8].setBounds(28, 180, 50, 10);
		p[9].setBounds(28, 100, 50, 10);
		p[10].setBounds(108, 100, 50, 10);
		p[11].setBounds(188, 100, 50, 10);
		p[12].setBounds(268, 100, 50, 10);
		p[13].setBounds(348, 100, 50, 10);
		p[14].setBounds(428, 100, 50, 10);
		p[15].setBounds(508, 100, 50, 10);
		p[16].setBounds(588, 100, 50, 10);
		p[17].setBounds(668, 100, 50, 10);
		p[18].setBounds(748, 100, 50, 10);
		p[19].setBounds(748, 180, 50, 10);
		p[20].setBounds(748, 260, 50, 10);
		p[21].setBounds(748, 340, 50, 10);
		p[22].setBounds(748, 420, 50, 10);
		p[23].setBounds(748, 500, 50, 10);
		p[24].setBounds(748, 580, 50, 10);
		p[25].setBounds(748, 660, 50, 10);
		p[26].setBounds(748, 740, 50, 10);
		p[27].setBounds(748, 816, 50, 10);
		p[28].setBounds(668, 816, 50, 10);
		p[29].setBounds(588, 816, 50, 10);
		p[30].setBounds(508, 816, 50, 10);
		p[31].setBounds(428, 816, 50, 10);
		p[32].setBounds(348, 816, 50, 10);
		p[33].setBounds(268, 816, 50, 10);
		p[34].setBounds(188, 816, 50, 10);
		p[35].setBounds(108, 816, 50, 10);

		lv[1].setBounds(28, 689, 50, 10);
		lv[2].setBounds(28, 609, 50, 10);
		lv[3].setBounds(28, 529, 50, 10);
		lv[5].setBounds(28, 369, 50, 10);
		lv[6].setBounds(28, 289, 50, 10);
		lv[7].setBounds(28, 209, 50, 10);
		lv[8].setBounds(28, 129, 50, 10);
		lv[10].setBounds(108, 50, 50, 10);
		lv[11].setBounds(188, 50, 50, 10);
		lv[12].setBounds(268, 50, 50, 10);
		lv[14].setBounds(428, 50, 50, 10);
		lv[15].setBounds(508, 50, 50, 10);
		lv[16].setBounds(588, 50, 50, 10);
		lv[17].setBounds(668, 50, 50, 10);
		lv[19].setBounds(748, 130, 50, 10);
		lv[20].setBounds(748, 210, 50, 10);
		lv[21].setBounds(748, 290, 50, 10);
		lv[23].setBounds(748, 450, 50, 10);
		lv[24].setBounds(748, 530, 50, 10);
		lv[25].setBounds(748, 610, 50, 10);
		lv[26].setBounds(748, 690, 50, 10);
		lv[28].setBounds(668, 770, 50, 10);
		lv[29].setBounds(588, 770, 50, 10);
		lv[30].setBounds(508, 770, 50, 10);
		lv[31].setBounds(428, 770, 50, 10);
		lv[33].setBounds(268, 770, 50, 10);
		lv[34].setBounds(188, 770, 50, 10);
		lv[35].setBounds(108, 770, 50, 10);
		nationp[0].setLocation(3, 756);
		nationp[0].setSize(80, 80);

		nationp[1].setLocation(3, 676);
		nationp[1].setSize(80, 80);

		nationp[2].setLocation(3, 596);
		nationp[2].setSize(80, 80);

		nationp[3].setLocation(3, 516);
		nationp[3].setSize(80, 80);

		nationp[4].setLocation(3, 436);
		nationp[4].setSize(80, 80);

		nationp[5].setLocation(3, 356);
		nationp[5].setSize(80, 80);

		nationp[6].setLocation(3, 276);
		nationp[6].setSize(80, 80);

		nationp[7].setLocation(3, 196);
		nationp[7].setSize(80, 80);

		nationp[8].setLocation(3, 116);
		nationp[8].setSize(80, 80);

		nationp[9].setLocation(3, 36);
		nationp[9].setSize(80, 80);

		nationp[10].setLocation(83, 36);
		nationp[10].setSize(80, 80);

		nationp[11].setLocation(163, 36);
		nationp[11].setSize(80, 80);

		nationp[12].setLocation(243, 36);
		nationp[12].setSize(80, 80);

		nationp[13].setLocation(323, 36);
		nationp[13].setSize(80, 80);

		nationp[14].setLocation(403, 36);
		nationp[14].setSize(80, 80);

		nationp[15].setLocation(483, 36);
		nationp[15].setSize(80, 80);

		nationp[16].setLocation(563, 36);
		nationp[16].setSize(80, 80);

		nationp[17].setLocation(643, 36);
		nationp[17].setSize(80, 80);

		nationp[18].setLocation(723, 36);
		nationp[18].setSize(80, 80);

		nationp[19].setLocation(723, 116);
		nationp[19].setSize(80, 80);

		nationp[20].setLocation(723, 196);
		nationp[20].setSize(80, 80);

		nationp[21].setLocation(723, 276);
		nationp[21].setSize(80, 80);

		nationp[22].setLocation(723, 356);
		nationp[22].setSize(80, 80);

		nationp[23].setLocation(723, 436);
		nationp[23].setSize(80, 80);

		nationp[24].setLocation(723, 516);
		nationp[24].setSize(80, 80);

		nationp[25].setLocation(723, 596);
		nationp[25].setSize(80, 80);

		nationp[26].setLocation(723, 676);
		nationp[26].setSize(80, 80);

		nationp[27].setLocation(723, 756);
		nationp[27].setSize(80, 80);

		nationp[28].setLocation(643, 756);
		nationp[28].setSize(80, 80);

		nationp[29].setLocation(563, 756);
		nationp[29].setSize(80, 80);

		nationp[30].setLocation(483, 756);
		nationp[30].setSize(80, 80);

		nationp[31].setLocation(403, 756);
		nationp[31].setSize(80, 80);

		nationp[32].setLocation(323, 756);
		nationp[32].setSize(80, 80);

		nationp[33].setLocation(243, 756);
		nationp[33].setSize(80, 80);

		nationp[34].setLocation(163, 756);
		nationp[34].setSize(80, 80);

		nationp[35].setLocation(83, 756);
		nationp[35].setSize(80, 80);
		nation[0].setBackground(Color.red);
		nation[0].setForeground(Color.blue);
		nation[0].setLocation(3, 756);
		nation[0].setSize(80, 80);
		nation[0].setOpaque(true);

		nation[1].setForeground(Color.blue);
		nation[1].setLocation(3, 676);
		nation[1].setSize(80, 80);
		nation[1].setBorder(new LineBorder(Color.lightGray, 3));

		nation[2].setForeground(Color.blue);
		nation[2].setLocation(3, 596);
		nation[2].setSize(80, 80);
		nation[2].setBorder(new LineBorder(Color.lightGray, 3));

		nation[3].setForeground(Color.blue);
		nation[3].setLocation(3, 516);
		nation[3].setSize(80, 80);
		nation[3].setBorder(new LineBorder(Color.lightGray, 3));

		nation[4].setForeground(Color.RED);
		nation[4].setLocation(3, 436);
		nation[4].setSize(80, 80);
		nation[4].setBorder(new LineBorder(Color.lightGray, 3));

		nation[5].setForeground(Color.blue);
		nation[5].setLocation(3, 356);
		nation[5].setSize(80, 80);
		nation[5].setBorder(new LineBorder(Color.lightGray, 3));

		nation[6].setForeground(Color.blue);
		nation[6].setLocation(3, 276);
		nation[6].setSize(80, 80);
		nation[6].setBorder(new LineBorder(Color.lightGray, 3));

		nation[7].setForeground(Color.blue);
		nation[7].setLocation(3, 196);
		nation[7].setSize(80, 80);
		nation[7].setBorder(new LineBorder(Color.lightGray, 3));

		nation[8].setForeground(Color.blue);
		nation[8].setLocation(3, 116);
		nation[8].setSize(80, 80);
		nation[8].setBorder(new LineBorder(Color.lightGray, 3));

		nation[9].setForeground(Color.blue);
		nation[9].setLocation(3, 36);
		nation[9].setSize(80, 80);
		nation[9].setBorder(new LineBorder(Color.black, 10));

		nation[10].setForeground(Color.blue);
		nation[10].setLocation(83, 36);
		nation[10].setSize(80, 80);
		nation[10].setBorder(new LineBorder(Color.lightGray, 3));

		nation[11].setForeground(Color.blue);
		nation[11].setLocation(163, 36);
		nation[11].setSize(80, 80);
		nation[11].setBorder(new LineBorder(Color.lightGray, 3));

		nation[12].setForeground(Color.blue);
		nation[12].setLocation(243, 36);
		nation[12].setSize(80, 80);
		nation[12].setBorder(new LineBorder(Color.lightGray, 3));

		nation[13].setForeground(Color.RED);
		nation[13].setLocation(323, 36);
		nation[13].setSize(80, 80);
		nation[13].setBorder(new LineBorder(Color.lightGray, 3));

		nation[14].setForeground(Color.blue);
		nation[14].setLocation(403, 36);
		nation[14].setSize(80, 80);
		nation[14].setBorder(new LineBorder(Color.lightGray, 3));

		nation[15].setForeground(Color.blue);
		nation[15].setLocation(483, 36);
		nation[15].setSize(80, 80);
		nation[15].setBorder(new LineBorder(Color.lightGray, 3));

		nation[16].setForeground(Color.blue);
		nation[16].setLocation(563, 36);
		nation[16].setSize(80, 80);
		nation[16].setBorder(new LineBorder(Color.lightGray, 3));

		nation[17].setForeground(Color.blue);
		nation[17].setLocation(643, 36);
		nation[17].setSize(80, 80);
		nation[17].setBorder(new LineBorder(Color.lightGray, 3));

		nation[18].setForeground(Color.blue);
		nation[18].setLocation(723, 36);
		nation[18].setSize(80, 80);
		nation[18].setBorder(new LineBorder(Color.black, 10));

		nation[19].setForeground(Color.blue);
		nation[19].setLocation(723, 116);
		nation[19].setSize(80, 80);
		nation[19].setBorder(new LineBorder(Color.lightGray, 3));

		nation[20].setForeground(Color.blue);
		nation[20].setLocation(723, 196);
		nation[20].setSize(80, 80);
		nation[20].setBorder(new LineBorder(Color.lightGray, 3));

		nation[21].setForeground(Color.blue);
		nation[21].setLocation(723, 276);
		nation[21].setSize(80, 80);
		nation[21].setBorder(new LineBorder(Color.lightGray, 3));

		nation[22].setForeground(Color.red);
		nation[22].setLocation(723, 356);
		nation[22].setSize(80, 80);
		nation[22].setBorder(new LineBorder(Color.lightGray, 3));

		nation[23].setForeground(Color.blue);
		nation[23].setLocation(723, 436);
		nation[23].setSize(80, 80);
		nation[23].setBorder(new LineBorder(Color.lightGray, 3));

		nation[24].setForeground(Color.blue);
		nation[24].setLocation(723, 516);
		nation[24].setSize(80, 80);
		nation[24].setBorder(new LineBorder(Color.lightGray, 3));

		nation[25].setForeground(Color.blue);
		nation[25].setLocation(723, 596);
		nation[25].setSize(80, 80);
		nation[25].setBorder(new LineBorder(Color.lightGray, 3));

		nation[26].setForeground(Color.blue);
		nation[26].setLocation(723, 676);
		nation[26].setSize(80, 80);
		nation[26].setBorder(new LineBorder(Color.lightGray, 3));

		nation[27].setForeground(Color.blue);
		nation[27].setLocation(723, 756);
		nation[27].setSize(80, 80);
		nation[27].setBorder(new LineBorder(Color.black, 10));

		nation[28].setForeground(Color.blue);
		nation[28].setLocation(643, 756);
		nation[28].setSize(80, 80);
		nation[28].setBorder(new LineBorder(Color.lightGray, 3));

		nation[29].setForeground(Color.blue);
		nation[29].setLocation(563, 756);
		nation[29].setSize(80, 80);
		nation[29].setBorder(new LineBorder(Color.lightGray, 3));

		nation[30].setForeground(Color.blue);
		nation[30].setLocation(483, 756);
		nation[30].setSize(80, 80);
		nation[30].setBorder(new LineBorder(Color.lightGray, 3));

		nation[31].setForeground(Color.blue);
		nation[31].setLocation(403, 756);
		nation[31].setSize(80, 80);
		nation[31].setBorder(new LineBorder(Color.lightGray, 3));

		nation[32].setForeground(Color.RED);
		nation[32].setLocation(323, 756);
		nation[32].setSize(80, 80);
		nation[32].setBorder(new LineBorder(Color.lightGray, 3));

		nation[33].setForeground(Color.blue);
		nation[33].setLocation(243, 756);
		nation[33].setSize(80, 80);
		nation[33].setBorder(new LineBorder(Color.lightGray, 3));

		nation[34].setForeground(Color.blue);
		nation[34].setLocation(163, 756);
		nation[34].setSize(80, 80);
		nation[34].setBorder(new LineBorder(Color.lightGray, 3));

		nation[35].setForeground(Color.blue);
		nation[35].setLocation(83, 756);
		nation[35].setSize(80, 80);
		nation[35].setBorder(new LineBorder(Color.lightGray, 3));

		Font fnt00 = new Font("Serief", Font.BOLD, 100);
		Font fnt = new Font("Serief", Font.ITALIC + Font.BOLD, 18);
		Font fntDice = new Font("Serief", Font.BOLD, 28);

		lab00.setFont(fnt00);
		lab01.setFont(fnt00);
		labDice.setFont(fntDice);

		for (int i = 0; i < 36; i++) {
			nation[i].setFont(fnt);
		}

		this.add(infoys);
		this.add(infobs);
		this.add(infogs);
		this.add(infors);
		this.add(lab00);
		this.add(lab01);
		this.add(labDice);
		this.add(rule);
		this.add(lby);
		this.add(lbb);
		this.add(lbg);
		this.add(lbr);
		this.add(infoy);
		this.add(infob);
		this.add(infog);
		this.add(infor);
		this.add(dice1);
		this.add(dice2);

		this.add(Dice);
		for (int i = 0; i < 36; i++) {
			add(nation[i]);
		}

		for (int i = 0; i < 36; i++) {
			add(p[i]);
		}
		for (int i = 0; i < 36; i++) {
			add(lv[i]);
		}
		for (int i = 0; i < 18; i++) {
			this.add(nationp[i]);
			nationp[i].setVisible(false);
		}
		for (int i = 19; i < 36; i++) {

			this.add(nationp[i]);
			nationp[i].setVisible(false);
		}
		this.setVisible(true);

	}
}
