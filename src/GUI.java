import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings({"rawtypes", "unchecked"})
public class GUI extends JFrame{
	private JFrame frame;
	private JCheckBox hexBox;
	private GUIListener listener;
	private String filename;
	private JList instructionList;
	private JList registerList;
	private JList memoryList;
	private JTextField pcPane;
	private JMenuBar menuBar;
	private JMenu menu, submenu;
	private JMenuItem menuItem;
	private JRadioButtonMenuItem rbMenuItem;
	private JCheckBoxMenuItem cbMenuItem;

	public GUI() {

		var menuBar = new JMenuBar();
		var exitIcon = new ImageIcon("src/resources/exit.png");

		var fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);

		var eMenuItem = new JMenuItem("Exit", exitIcon);
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener((event) -> System.exit(0));

		setJMenuBar(menuBar);

		Font mono = new Font("Monospaced", Font.PLAIN, 13);
		instructionList = new JList();
		instructionList.setFont(mono);
		JScrollPane instructionPane = new JScrollPane(instructionList);
		JPanel leftPanel = new JPanel(new BorderLayout());
		leftPanel.add(instructionPane);

		registerList = new JList();
		registerList.setFont(mono);
		memoryList = new JList();
		memoryList.setFont(mono);

		JScrollPane registerPane = new JScrollPane(registerList);
		JScrollPane dataPane = new JScrollPane(memoryList);
		JPanel rightPanel = new JPanel(new BorderLayout());
		rightPanel.add(dataPane, BorderLayout.EAST);
		rightPanel.add(registerPane, BorderLayout.WEST);

		JMenuBar menubar = new JMenuBar();

		JMenu file = new JMenu("Arquivos");
		menubar.add(file);
		JMenuItem chooseButton = new JMenuItem("Abrir Arquivo MIPS");
		file.add(chooseButton);
		JMenuItem loadButton = new JMenuItem("Recarregar arquivo");
		file.add(loadButton);

		JMenu edit = new JMenu("Editar");
		menubar.add(edit);

		JMenu exec = new JMenu("Executar");
		menubar.add(exec);

		JMenuItem stepButton = new JMenuItem("Proximo Passo");
		exec.add(stepButton);

		final JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));

		chooseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int returnVal = fileChooser.showOpenDialog(frame);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					filename = fileChooser.getSelectedFile().getPath();
				}

				if(filename != null){
					listener.onLoad(filename);
				}
			}
		});

		loadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(filename != null){
					listener.onLoad(filename);
				}
			}
		});

		pcPane = new JTextField(7);
		pcPane.setBorder(new EmptyBorder(0, 0, 0, 5));
		pcPane.setEditable(false);
		pcPane.setOpaque(false);

		JButton runButton = new JButton("EXECUTAR TUDO");
		JButton stopButton = new JButton("PARAR/SALVAR");
		JButton resetButton = new JButton("RESETAR");
		JPanel botPanel = new JPanel();
		hexBox = new JCheckBox("HEXADECIMAIS");

		botPanel.add(pcPane);
		//botPanel.add(stepButton);
		//botPanel.add(runButton);
		//botPanel.add(stopButton);
		//botPanel.add(resetButton);
		//botPanel.add(hexBox);
		fileMenu.add(eMenuItem);
		menuBar.add(fileMenu);

		stepButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listener.onStep();			
			}
		});

		runButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listener.onRun();
			}
		});

		stopButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listener.onStop();	
			}
		});

		resetButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listener.onReset();	
			}
		});

		hexBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(hexBox.isSelected()){
					listener.onHex();
				} else {
					listener.onDec();
				}
			}
		});


		frame = new JFrame("MIPS Simulator");
		frame.add(leftPanel, BorderLayout.CENTER);
		frame.add(rightPanel, BorderLayout.EAST);
		frame.add(botPanel, BorderLayout.SOUTH);
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setJMenuBar(menubar);

		setPc(0);
	}

	public void setGUIListener(GUIListener listener) {
		this.listener = listener;
	}

	public void setInstructionListModel(ListModel model){
		instructionList.setModel(model);
	}

	public void setRegisterListModel(ListModel model){
		registerList.setModel(model);
	}

	public void setMemoryListModel(ListModel model){
		memoryList.setModel(model);
	}

	public interface GUIListener {
		public void onLoad(String filename);
		public void onStep();
		public void onRun();
		public void onStop();
		public void onReset();
		public void onHex();
		public void onDec();
	}

	public void selectInstruction(int index) {
		instructionList.setSelectedIndex(index);
	}

	public void clearInstructionSelection() {
		instructionList.clearSelection();
	}

	public void setPc(int pc) {
		pcPane.setText("PC: " + pc);
	}
}
