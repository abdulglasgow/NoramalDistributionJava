import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.text.DecimalFormat;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class swingND {

	private JFrame frmNormalProbabilityCalculator;
	private JTextField txtValue2;
	private JTextField txtSD;
	private JTextField txtMean;
	private JTextField txtValue1;
	private JTextField txtResult;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingND window = new swingND();
					window.frmNormalProbabilityCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public swingND() {
		initialize();
		
	}

	
	

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		//=====================###### STRUCTURE AND BODY #####======================
		frmNormalProbabilityCalculator = new JFrame();
		frmNormalProbabilityCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
		
		frmNormalProbabilityCalculator.setResizable(false);
		frmNormalProbabilityCalculator.setTitle("Normal Probability Calculator");
		frmNormalProbabilityCalculator.setBounds(100, 100, 300, 300);
		frmNormalProbabilityCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNormalProbabilityCalculator.getContentPane().setLayout(null);
		frmNormalProbabilityCalculator.setLocationRelativeTo(null); //// *** this will center your app ***
		//=====================###### STRUCTURE AND BODY #####======================
		
		//=====================###### LABELS #####======================
		JLabel lblNewLabel = new JLabel("X-Value");
		lblNewLabel.setBounds(19, 90, 61, 16);
		frmNormalProbabilityCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SD");
		lblNewLabel_1.setBounds(19, 146, 61, 16);
		frmNormalProbabilityCalculator.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("Mean");
		label.setBounds(19, 118, 61, 16);
		frmNormalProbabilityCalculator.getContentPane().add(label);
		
		JLabel lblNormalProbability = new JLabel("Normal Probability = ");
		lblNormalProbability.setForeground(Color.BLUE);
		lblNormalProbability.setBounds(19, 189, 158, 16);
		frmNormalProbabilityCalculator.getContentPane().add(lblNormalProbability);
		
		JLabel lblAnd = new JLabel("AND");
		//lblAnd.setForeground(SystemColor.window);
		lblAnd.setVisible(false);
		lblAnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnd.setBounds(149, 90, 61, 16);
		frmNormalProbabilityCalculator.getContentPane().add(lblAnd);
		//=====================###### LABELS #####======================
		
		//=====================###### TEXT FIELDS #####======================
		txtValue1 = new JTextField();
		txtValue1.setColumns(10);
		txtValue1.setBounds(77, 85, 68, 26);
		frmNormalProbabilityCalculator.getContentPane().add(txtValue1);
		
		txtValue2 = new JTextField();
		txtValue2.setVisible(false);
		txtValue2.setBounds(211, 85, 68, 26);
		frmNormalProbabilityCalculator.getContentPane().add(txtValue2);
		txtValue2.setColumns(10);
		
		txtSD = new JTextField();
		txtSD.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//JOptionPane.showMessageDialog(null, "HITyped");
			}
		});
		txtSD.setBounds(77, 141, 68, 26);
		frmNormalProbabilityCalculator.getContentPane().add(txtSD);
		txtSD.setColumns(10);
		
		txtMean = new JTextField();
		txtMean.setColumns(10);
		txtMean.setBounds(77, 113, 68, 26);
		frmNormalProbabilityCalculator.getContentPane().add(txtMean);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBounds(178, 184, 101, 26);
		frmNormalProbabilityCalculator.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		//=====================###### TEXT FIELDS #####======================
		
		//=====================###### BUTTONS AND RADIO BUTTONS #####======================
		JRadioButton rdbtnBelow = new JRadioButton("Below");
		rdbtnBelow.setSelected(true);
		rdbtnBelow.setBounds(6, 55, 68, 23);
		frmNormalProbabilityCalculator.getContentPane().add(rdbtnBelow);
		
		JRadioButton rdbtnAbove = new JRadioButton("Above");
		rdbtnAbove.setBounds(99, 55, 78, 23);
		frmNormalProbabilityCalculator.getContentPane().add(rdbtnAbove);
	
		
		JRadioButton rdbtnBetween = new JRadioButton("Between");
		rdbtnBetween.setBounds(189, 55, 90, 23);
		frmNormalProbabilityCalculator.getContentPane().add(rdbtnBetween);
		
		ButtonGroup bg1 = new ButtonGroup( );
		bg1.add(rdbtnBetween);
		bg1.add(rdbtnBelow);
		bg1.add(rdbtnAbove);
		
		JButton btnCalc = new JButton("Calculate Normal Probability");
		btnCalc.setBounds(49, 222, 207, 39);
		frmNormalProbabilityCalculator.getContentPane().add(btnCalc);
		
		
		//=====================###### MENU Bar #####======================
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 300, 22);
		frmNormalProbabilityCalculator.getContentPane().add(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenuItem menuAbout = new JMenuItem("About");
		menuAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "This tiny application has been developed \nto calculate normal probability for given \nnumber or range ..\n\nWorking on all operating systems \n\nProgrammed by: Abdulfattah Alhazmi\nAbdulfattah.Alhazmi@gmail.com";
				JOptionPane.showMessageDialog(null, message, "About", 1);
			}
		});
		menuFile.add(menuAbout);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		
		
		
		menuFile.add(menuExit);
		
		JLabel lblProgrammedByAbdulfattah = new JLabel("Programmed by: Abdulfattah Alhazmi");
		lblProgrammedByAbdulfattah.setBounds(33, 27, 235, 16);
		frmNormalProbabilityCalculator.getContentPane().add(lblProgrammedByAbdulfattah);
		lblProgrammedByAbdulfattah.setForeground(Color.BLUE);
		lblProgrammedByAbdulfattah.setHorizontalAlignment(SwingConstants.CENTER);
		
		Panel panel = new Panel();
		panel.setBounds(6, 37, 284, 47);
		frmNormalProbabilityCalculator.getContentPane().add(panel);
		frmNormalProbabilityCalculator.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblNewLabel_1, label, lblAnd, lblProgrammedByAbdulfattah, txtValue1, txtValue2, txtSD, txtMean, rdbtnBelow, rdbtnAbove, rdbtnBetween, btnCalc, panel}));
		//=====================###### MENU BAR #####======================
		
		//=====================###### MENU BAR EVENTS #####======================
		menuExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//=====================###### MENU BAR EVENTS #####======================
		
		//=====================###### BUTTONS AND RADIO BUTTONS #####======================
		
		
		//=====================###### RADIO BUTTONS EVENTS / LISTNERS #####======================	
		rdbtnBelow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnBelow.isSelected()){
					txtValue2.setVisible(false);
					lblAnd.setVisible(false);
				}
			}
		});
		
		
		rdbtnAbove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAbove.isSelected()){
					txtValue2.setVisible(false);
					lblAnd.setVisible(false);
				}
			}
		});
		
		rdbtnBetween.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValue2.setEnabled(true);
				txtValue2.setVisible(true);
				lblAnd.setVisible(true);
				}
		});
		//=====================###### RADIO BUTTONS EVENTS / LISTNERS #####======================	
				
		
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double mean = 0, value1 = 0, value2 = 0, value2Temp =0, SD =0;	
				
						try{
							String val1 = txtValue1.getText();
							if(!val1.isEmpty()){
								value1 = Double.parseDouble(val1);
							}
						
							String val2 = txtValue2.getText();
							if(!val2.isEmpty()){
								value2 = Double.parseDouble(val2);
							}
							
							
							String valTemp = txtValue2.getText();
							if(!valTemp.isEmpty()){
								value2Temp = Double.parseDouble(valTemp);
							}
							
							String m = txtMean.getText();
							if(!m.isEmpty()){
								 mean = Double.parseDouble(m);
							}
							
						
							String sDev = txtSD.getText();
							if(!sDev.isEmpty()){  //&& sDev == "^[0-9]+"
								 SD = Double.parseDouble(sDev);
							}
						}catch(Exception er){
							JOptionPane.showMessageDialog(null, er.getMessage(), "Entry Error", 0);
						}
						
						
						
						
						
					double prob = NormalCDF.compute(value1, mean, SD);
					prob = Double.parseDouble(new DecimalFormat("#.####").format(prob));
					
					
					if(rdbtnBelow.isSelected()){
						lblNormalProbability.setText("P ( X < "+ txtValue1.getText() +" ) = ");
						txtResult.setText(prob+"");
					}else if(rdbtnAbove.isSelected()){
						prob -=1;
						prob = Double.parseDouble(new DecimalFormat("#.####").format(prob));
						lblNormalProbability.setText("P ( X > "+ txtValue1.getText() +" ) = ");
						txtResult.setText(Math.abs(prob)+"");
					}else{
						if(value2Temp >= value1){
						    value2 = value2Temp;
							double probAbove = NormalCDF.compute(value2, mean, SD);
							probAbove -=1;
							probAbove = Double.parseDouble(new DecimalFormat("#.####").format(probAbove));
							probAbove = Math.abs(probAbove);
							lblNormalProbability.setText("P("+ value1 +" < X < " + value2 + ") =");
							//JOptionPane.showMessageDialog(null, "prob= "+ prob +" ; probAbove= " + probAbove);
							//JOptionPane.showMessageDialog(null, "probAbove+prob= "+ probAbove+prob +" ; 1-probAbove+prob= " + (1-(probAbove+prob)));
							prob = 1- (probAbove+prob);
							prob = Double.parseDouble(new DecimalFormat("#.####").format(prob));
							txtResult.setText(Math.abs(prob)+"");
						}else{
							value2 = value1;
							value1 = value2Temp;
							//JOptionPane.showMessageDialog(null, "value 1= " + value1 + "value 2= " + value2);
							double probAbove = NormalCDF.compute(value2, mean, SD);
							probAbove -=1;
							probAbove = Double.parseDouble(new DecimalFormat("#.####").format(probAbove));
							probAbove = Math.abs(probAbove);
							lblNormalProbability.setText("P("+ value1 +" < X < " + value2 + ") =");
							double probBelow = NormalCDF.compute(value1, mean, SD);
							probBelow= Double.parseDouble(new DecimalFormat("#.####").format(probBelow));
							//JOptionPane.showMessageDialog(null, "prob= "+ probBelow +" ; probAbove= " + probAbove);
							//JOptionPane.showMessageDialog(null, "probAbove+prob= "+ probAbove+probBelow +" ; 1-probAbove+prob= " + (1-(probAbove+probBelow)));
							prob = 1- (probAbove+probBelow);
							prob = Double.parseDouble(new DecimalFormat("#.####").format(prob));
							txtResult.setText(Math.abs(prob)+"");
						}
					}
			}
		});
		
	}
}


