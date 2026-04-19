<div align="center">
  <img src="./public/image/lophine/lophine3.png" alt="Lophine Logo" width="300">
  
  # Lophine
  
  *Lophine is a Luminol fork with many useful optimizations and configurable vanilla features, aims to provide more function for survival-usable circuit on folia (Please note that Fabric should be used for complete survival-usable)*
  
  ![Created At](https://img.shields.io/github/created-at/LuminolMC/Lophine?style=for-the-badge&color=blue)
  [![License](https://img.shields.io/github/license/LuminolMC/Lophine?style=for-the-badge&color=green)](LICENSE.md)
  [![Issues](https://img.shields.io/github/issues/LuminolMC/Lophine?style=for-the-badge&color=orange)](https://github.com/LuminolMC/Lophine/issues)
  
  ![Commit Activity](https://img.shields.io/github/commit-activity/w/LuminolMC/Lophine?style=for-the-badge&color=purple)
  ![CodeFactor Grade](https://img.shields.io/codefactor/grade/github/LuminolMC/Lophine?style=for-the-badge&color=yellow)
  ![GitHub all releases](https://img.shields.io/github/downloads/LuminolMC/Lophine/total?style=for-the-badge&color=red)
  
  ![Repo contributors](https://img.shields.io/github/contributors/LuminolMC/Lophine?style=for-the-badge&color=brightgreen)
  
  **English** | [中文](./README.md)
</div>

---

## ✨ Core Features

- 🔧 **Configurable Vanilla Features** - Flexibly adjust game mechanics to suit different server needs
- 📊 **Tpsbar Support** - Real-time TPS status display
- 🐛 **Folia Bug Fixes** - Targeted fixes for known Folia issues
- 💾 **Multiple World Format Support** - Support for linear and b_linear (linear reimplementation) world formats
- 🔬 **Redstone Enhancement** - More redstone functionality on Folia (use Fabric for complete redstone features)
- 🛠️ **More Useful Functions** - Continuously adding useful server features
- ⭐ **And More**

## 📥 Download

### Stable Releases
All release versions can be found on the [Releases](https://github.com/LuminolMC/Lophine/releases) page.

### Development Builds
If you want to experience the latest features, you can build it yourself following the steps below.

### Build Steps

```bash
# Clone the project
git clone https://github.com/LuminolMC/Lophine.git
cd Lophine

# Apply patches and build Paperclip JAR
./gradlew applyAllPatches && ./gradlew createMojmapPaperclipJar
```

After building, you can find the generated JAR file in the `lophine-server/build/libs` directory.

## 🔌 API Usage

### Gradle Configuration

```kotlin
repositories {
    maven {
        url = "https://repo.menthamc.org/repository/maven-public/"
    }
}

dependencies {
    compileOnly("fun.bm.lophine:lophine-api:$VERSION")
}
```

### Maven Configuration

```xml
<repositories>
    <repository>
        <id>menthamc</id>
        <url>https://repo.menthamc.org/repository/maven-public/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>fun.bm.lophine</groupId>
        <artifactId>luminol-api</artifactId>
        <version>$VERSION</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
<div align="center">
  <b>If this project helps you, please don't forget to give us a ⭐Star!</b>
</div>
