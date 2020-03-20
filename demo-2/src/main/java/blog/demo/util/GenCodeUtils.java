package blog.demo.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author chenluby
 * 代码生成器
 */
public class GenCodeUtils {


    public static void main(String[] args) {
        generateCode();
    }

    /**
     * 执行生成代码
     */
    public static void generateCode() {
        //项目包名
        String packageName = "blog.demo";
        generateByTables(packageName, "blog_demo");

    }

    /**
     * @param packageName 包名
     * @param tableNames  表名，可以多个表
     */
    private static void generateByTables(String packageName, String... tableNames) {

        // 数据库信息
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/blog-demo?useSSL=false&serverTimezone=GMT%2B8";
        DataSourceConfig dataSourceConfig = new DataSourceConfig()
                .setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("root123456")
                // mysql 5
                //.setDriverName("com.mysql.jdbc.Driver")
                // mysql 8
                .setDriverName("com.mysql.cj.jdbc.Driver")
                /*.setTypeConvert(new MySqlTypeConvert() {
                    @Override
                    public PropertyInfo processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                        //.....
                        // 当发现生成的类型并不能满足你的要求时，可以去这里看，然后重写
                    }
                })*/;

        // 全局配置
        GlobalConfig config = new GlobalConfig()
                .setActiveRecord(false)
                //作者
                .setAuthor("chenluby")
                //建议设置非项目路径再拷贝进来项目
                .setOutputDir("D:/File/generator/src/main/java")
                //.setOutputDir("src\\main\\java")
                .setFileOverride(true)
                // 不需要ActiveRecord特性的请改为false
                .setActiveRecord(true)
                // XML 二级缓存
                .setEnableCache(false)
                // XML ResultMap
                .setBaseResultMap(true)
                // XML columList
                .setBaseColumnList(true)
                //是否生成 kotlin 代码
                .setKotlin(false)
                // 自定义文件命名，注意 %s 会自动填充表实体属性！
                .setMapperName("%sMapper")
                .setXmlName("%sMapper")
                .setServiceName("%sService")
                .setServiceImplName("%sServiceImpl")
                //.setControllerName("%sController")
                //只使用 java.util.date 代替
                .setDateType(DateType.ONLY_DATE)
                .setIdType(IdType.ID_WORKER);
        // model swagger2
        // .setSwagger2(true);
        //.setOpen(true) // 是否打开输出目录


        StrategyConfig strategyConfig = new StrategyConfig()
                // 全局大写命名 ORACLE 注意
                .setCapitalMode(true)
                //.setDbColumnUnderline(true)
                // 此处可以修改为您的表前缀(数组)
                //.setTablePrefix("t_")
                // 表名生成策略
                .setNaming(NamingStrategy.underline_to_camel)
                //修改替换成你需要的表名，多个表名传数组
                .setInclude(tableNames)
                //.setExclude(new String[]{"test"}) // 排除生成的表
                // lombok实体
                .setEntityLombokModel(true)
                // 【实体】是否为构建者模型（默认 false）
                .setEntityBuilderModel(false)
                // 【实体】是否生成字段常量（默认 false）// 可通过常量名获取数据库字段名 // 3.x支持lambda表达式
                .setEntityColumnConstant(false)
                // 逻辑删除属性名称
                .setLogicDeleteFieldName("bd_logic_delete")
                // .entityTableFieldAnnotationEnable(true);
                .setEntityTableFieldAnnotationEnable(true);

        // 包信息配置
        PackageConfig packageConfig = new PackageConfig()
                .setParent(packageName)
                //控制层包名
                .setController(null)
                //实体包名
                .setEntity("entity")
                //mapper包名
                .setMapper("mapper")
                //xml包名
                .setXml("mapperxml");

        // 执行器
        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .execute();
    }
}

