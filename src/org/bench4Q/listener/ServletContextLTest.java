package org.bench4Q.listener;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.IgniteTransactions;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.cache.query.QueryCursor;
import org.apache.ignite.cache.query.SqlFieldsQuery;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.configuration.TransactionConfiguration;
import org.apache.ignite.internal.processors.cache.transactions.TransactionProxyImpl;
import org.apache.ignite.transactions.Transaction;
import org.bench4Q.Utils.ConfigurationTool;
import org.bench4Q.Utils.JdbcSource;
import org.bench4Q.bean.Country;
import org.bench4Q.bean.Person;
import org.bench4Q.servlet.Database;
import org.bench4Q.servlet.new_products_servlet;
import org.bench4Q.servlet.order_display_servlet;

/**
 * Application Lifecycle Listener implementation class ServletContextLTest
 *
 */
@WebListener
public class ServletContextLTest implements ServletContextListener {

	public static Ignite ignite;

	public static String REPLICATED_cache = "REPLICATED";

	public static String PARTITIONED_cache = "PARTITIONED";

	/**
	 * Default constructor.
	 */
	public ServletContextLTest() {
		// TODO Auto-generated constructor stub
		System.out.println("context");
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("context销毁");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("context初始化");
		IgniteConfiguration ic = ConfigurationTool.getTool()
				.getIgniteConfiguration(false);
		createCache(ic);
		// 开启事务
		TransactionConfiguration txCfg = new TransactionConfiguration();
		ic.setTransactionConfiguration(txCfg);

		ignite = Ignition.start(ic);
	//	ignite = Ignition.start("myconfig.xml");
	/*	CacheConfiguration[] ccfs = ignite.configuration().getCacheConfiguration();
		for(CacheConfiguration ccf:ccfs)
			System.out.println(ccf.getAtomicityMode());*/
		try {
			IgniteCache<Object, Object> Addresscache = ignite.getOrCreateCache("Address");
			Addresscache.loadCache(null);
			IgniteCache<Object, Object> Authorcache = ignite.getOrCreateCache("Author");
			Authorcache.loadCache(null);
			IgniteCache<Object, Object> CcXactscache = ignite.getOrCreateCache("CcXacts");
			CcXactscache.loadCache(null);
			IgniteCache<Object, Object> Countrycache = ignite.getOrCreateCache("Country");
			Countrycache.loadCache(null);
			IgniteCache<Object, Object> Customercache = ignite.getOrCreateCache("Customer");
			Customercache.loadCache(null);
			IgniteCache<Object, Object> Itemcache = ignite.getOrCreateCache("Item");
			Itemcache.loadCache(null);
			IgniteCache<Object, Object> OrderLinecache = ignite.getOrCreateCache("OrderLine");
			OrderLinecache.loadCache(null);
			IgniteCache<Object, Object> Orderscache = ignite.getOrCreateCache("Orders");
			Orderscache.loadCache(null);
			IgniteCache<Object, Object> ShoppingCartcache = ignite.getOrCreateCache("ShoppingCart");
			ShoppingCartcache.loadCache(null);
			IgniteCache<Object, Object> ShoppingCartLinecache = ignite.getOrCreateCache("ShoppingCartLine");
			ShoppingCartLinecache.loadCache(null);
			System.out.println("111111111111111111111111111");
			Database.initial();
	//		queryJdbcCache();

			// 使用另一个客户端节点进行查询
	//		 queryCacheByOtherNode();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 创建缓存
	 * 
	 * @param ic
	 */

	public static void createCache(IgniteConfiguration ic) {
		// 手工配置
		/*
		 * CacheConfiguration<String, Object> repCacheCfg = new
		 * CacheConfiguration<>(); repCacheCfg.setName(REPLICATED_cache);
		 * repCacheCfg.setCacheMode(CacheMode.REPLICATED);
		 * repCacheCfg.setIndexedTypes(Object.class, Country.class);
		 * 
		 * ic.setCacheConfiguration(repCacheCfg);
		 */

		// 使用自动生成的配置代码
		CacheConfiguration<Object, Object> Addressccfg = null;
		CacheConfiguration<Object, Object> Authorccfg = null;
		CacheConfiguration<Object, Object> CcXactsccfg = null;
		CacheConfiguration<Object, Object> Countryccfg = null;
		CacheConfiguration<Object, Object> Customerccfg = null;
		CacheConfiguration<Object, Object> Itemccfg = null;
		CacheConfiguration<Object, Object> OrderLineccfg = null;
		CacheConfiguration<Object, Object> Ordersccfg = null;
		CacheConfiguration<Object, Object> ShoppingCartccfg = null;
		CacheConfiguration<Object, Object> ShoppingCartLineccfg = null;
		try {
			Addressccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("Address");
			Authorccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("Author");
			CcXactsccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("CcXacts");
			Countryccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("Country");
			Customerccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("Customer");
			Itemccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("Item");
			OrderLineccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("OrderLine");
			Ordersccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("Orders");
			ShoppingCartccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("ShoppingCart");
			ShoppingCartLineccfg = org.bench4Q.cacheConfig.CacheConfig
					.getCacheConfiguration("ShoppingCartLine");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CacheConfiguration[] caches = new CacheConfiguration[] {
				Addressccfg, Authorccfg, CcXactsccfg, Countryccfg,
				Customerccfg, Itemccfg, OrderLineccfg, Ordersccfg,
				ShoppingCartccfg, ShoppingCartLineccfg };
	//	CacheConfiguration[] cacheConfigurations = new CacheConfiguration[] {ccfg,ShoppingCartccfg,ShoppingCartLineccfg,Itemccfg,Customerccfg};
		ic.setCacheConfiguration(caches);

	}

	public static void queryCacheByOtherNode() {
		Ignite ignite;
		IgniteConfiguration ic = ConfigurationTool.getTool()
				.getIgniteConfiguration("cilent2", true);

		/*
		 * CacheConfiguration<String, Object> repCacheCfg = new
		 * CacheConfiguration<>(); repCacheCfg.setName(REPLICATED_cache);
		 * repCacheCfg.setCacheMode(CacheMode.REPLICATED);
		 * repCacheCfg.setIndexedTypes(Object.class, Country.class);
		 * ic.setCacheConfiguration(repCacheCfg);
		 */
		createCache(ic);

		ignite = Ignition.start(ic);

		// 事务
		IgniteTransactions transactions = ignite.transactions();

		TransactionProxyImpl<Object, Object> transaction = (TransactionProxyImpl<Object, Object>) transactions
				.txStart();

		Connection connection = null;

		try {

			IgniteCache<Object, Person> cache = ignite
					.getOrCreateCache("Country");
			QueryCursor<List<?>> cursor = cache.query(new SqlFieldsQuery(
					"select * from Country limit 50"));

			for (List<?> row : cursor) {
				StringBuffer sb = new StringBuffer();
				for (Object c : row) {
					sb.append(c);
					sb.append(",");
				}
				System.out.println("从内存中读取数据");
				System.out.println(sb.toString());

				// connection.commit();
			}
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("事务回滚");
			transaction.rollback();
			e.printStackTrace();
		}
	}
	

	public static void queryJdbcCache() throws Exception {

		Class.forName("org.apache.ignite.IgniteJdbcDriver");

		// Connection conn =
		// DriverManager.getConnection("jdbc:ignite:cfg://cache=Country@C:\\Users\\Administrator\\git\\Bench4Q-TPCW\\Bench4Q_SUT\\General_SUT\\src\\ignite-jdbc.xml");

		Connection conn = DriverManager
				.getConnection("jdbc:ignite://localhost:11211/ShoppingCart");

		// Connection conn =
		// DriverManager.getConnection("jdbc:ignite:cfg://cache=Country@C:/Users/Administrator/git/Bench4Q-TPCW/Bench4Q_SUT/General_SUT/src/org/test/jndi/myconfig.xml");

		// conn.setAutoCommit(false);

		ResultSet rs = null;
		PreparedStatement stmt = null;
		try {
	//		rs = conn.createStatement().executeQuery("SELECT J.i_id,J.i_thumbnail from item I, item J where (I.i_related1 = J.i_id or I.i_related2 = J.i_id or I.i_related3 = J.i_id or I.i_related4 = J.i_id or I.i_related5 = J.i_id) and I.i_id = 20");
			rs = conn.createStatement().executeQuery("SELECT SC_TIME,line.SCL_QTY from shoppingcart,\"ShoppingCartLine\".ShoppingCartLine as line");
			while(rs.next()){
				System.out.println(rs.getTimestamp(1));
				System.out.println(rs.getInt(2));
			}
/*			stmt = conn
					.prepareStatement("select co_name,co_id from Country where co_id = ?");
			stmt.setInt(1, 30);
			rs = stmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("co_name");
				int age = rs.getInt("co_id");
				System.out.println("name" + name + "-------------------id"
						+ age);
			}*/
		//	 conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
		}
	}

	/**
	 * 从内存中查询数据
	 */
	private static void queryCache(IgniteConfiguration ic) {
		// IgniteCache<Object, Object> cache = ignite
		// .getOrCreateCache("REPLICATED");
		IgniteCache<Object, Object> cache = ignite.cache("REPLICATED");

		SqlFieldsQuery sfq = new SqlFieldsQuery("select * from country");

		QueryCursor<List<?>> cursor = cache.query(sfq);

		for (List<?> row : cursor) {
			StringBuffer sb = new StringBuffer();
			for (Object c : row) {
				sb.append(c);
				sb.append(",");
			}
			System.out.println("从内存中读取数据");
			System.out.println(sb.toString());

		}

	}

	/**
	 * 从磁盘中读取数据到内存中
	 * 
	 * @throws Exception
	 */
	private static void loadCache() throws Exception {

		Connection conn = null;

		Statement st = null;

		ResultSet rs = null;

		try {
			// 获取mysql连接
			conn = JdbcSource.getConnection();
			// 创建重复式缓存
			IgniteCache<String, Object> REPcache = ignite
					.getOrCreateCache(REPLICATED_cache);
			// 获得Statement对象
			st = conn.createStatement();
			// 进行数据库查询
			rs = st.executeQuery("select * from country");
			// 对查询结果进行遍历
			while (rs.next()) {
				/*
				 * Person p = new Person(); p.setName(rs.getString("name"));
				 * p.setAge(rs.getInt("age")); System.out.println(p);
				 * //向内存中放入键值对，键为javabean主键，值为javabean
				 * REPcache.put(rs.getString("name"), p);
				 */

				org.bench4Q.bean.Country country = new org.bench4Q.bean.Country();
				country.setCoId(rs.getInt(1));
				country.setCoName(rs.getString(4));
				System.out.println(country);
				// 向内存中放入键值对，键为javabean主键，值为javabean
				REPcache.put(rs.getString(1), country);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("连接数据库异常");
			e.printStackTrace();
		} finally {
			if (rs != null)
				rs.close();
			if (conn != null)
				conn.close();
			if (st != null)
				st.close();
		}
	}
}
