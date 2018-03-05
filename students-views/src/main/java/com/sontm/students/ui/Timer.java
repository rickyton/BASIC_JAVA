package com.sontm.students.ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;

public class Timer extends Thread {
	private boolean isRunning;
	private JLabel timeLabel;
	private SimpleDateFormat timeFormat;

	public Timer() {

	}

	public Timer(JLabel timeLabel) {
		initializeVariable(timeLabel);
	}

	private void initializeVariable(JLabel timeLabel) {
		this.timeLabel = timeLabel;
		this.isRunning = true;
		timeFormat = new SimpleDateFormat("hh:mm:ss");
	}

	@Override
	public void run() {
		while (isRunning) {
			Calendar calendar = Calendar.getInstance();
			Date currentTime = calendar.getTime();
			timeLabel.setText(timeFormat.format(currentTime));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
}
