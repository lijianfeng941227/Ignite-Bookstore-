package org.bench4Q.test;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.configuration.TransactionConfiguration;
import org.bench4Q.Utils.ConfigurationTool;
import org.bench4Q.listener.ServletContextLTest;

public class Main {
	public static void main(String[] args) {
		IgniteConfiguration ic = ConfigurationTool.getTool()
				.getIgniteConfiguration(false);
		Ignite ignite = null;
		ServletContextLTest.createCache(ic);
		// ¿ªÆôÊÂÎñ
		TransactionConfiguration txCfg = new TransactionConfiguration();
		ic.setTransactionConfiguration(txCfg);

		ignite = Ignition.start(ic);
	}
}
