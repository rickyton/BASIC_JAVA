package com.sontm.students.ui;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sontm.constant.utils.StringConstant;

public class StatusPanel extends JPanel {
	private JLabel statusLabel;
	private JLabel timeLabel;
	private Timer timer;

	public StatusPanel() {
		initializeVariable();
		initializeLayout();
		startTimer();
	}

	private void startTimer() {
		timer.start();
	}

	private void stopTimer() {
		timer.setRunning(false);
	}

	private void initializeLayout() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(statusLabel);
		this.add(timeLabel);
	}

	private void initializeVariable() {
		statusLabel = new JLabel();
		statusLabel.setText(StringConstant.STATUS_PANEL_TEXT);
		timeLabel = new JLabel();
		timer = new Timer(timeLabel);
	}
}
