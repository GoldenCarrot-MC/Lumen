package fun.bm.lophine.config.modules.experiment;

import me.earthme.luminol.config.IConfigModule;
import me.earthme.luminol.config.flags.ConfigClassInfo;
import me.earthme.luminol.config.flags.ConfigInfo;
import me.earthme.luminol.enums.EnumConfigCategory;

@ConfigClassInfo(category = EnumConfigCategory.EXPERIMENT, name = "Lumen_config")
public class FoliaOptimizationConfig implements IConfigModule {
    @ConfigInfo(name = "blockpos-pooling", comments = "是否启用 MutableBlockPos 对象池化。启用后将通过复用对象减少短生命周期对象的分配，缓解 GC 压力。")
    public static boolean blockposPooling = false;

    @ConfigInfo(name = "max-blockpos-pool-size", comments = "每个线程 MutableBlockPos 池的最大容量。")
    public static int maxBlockposPoolSize = 1024;

    @ConfigInfo(name = "type-filterable-collections", comments = "是否启用 EntitySection 类型索引优化。开启后将按实体类型分类存储，将 getEntitiesOfClass 的搜索范围从全量遍历缩小到特定类型查找。")
    public static boolean typeFilterableCollections = false;

    @ConfigInfo(name = "primitive-bimap", comments = "是否在注册表中使用原始类型 Bimap 优化。开启后将使用 fastutil 集合替代原版 Map，完全消除注册表反向查找（如通过对象获取 ID）时的 Integer 装箱开销。")
    public static boolean primitiveBimap = false;

    @ConfigInfo(name = "compact-sine-lut", comments = "是否使用紧凑型正弦查找表。通过将 LUT 尺寸从 256KB 缩小至 16KB，使其能完全驻留在 L1 缓存中，显著提升密集实体场景下的 CPU 运算效率。")
    public static boolean compactSineLut = false;
}
