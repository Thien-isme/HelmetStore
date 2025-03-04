USE [master]
GO
/****** Object:  Database [HelmetStore]    Script Date: 2/27/2025 2:54:38 PM ******/
CREATE DATABASE [HelmetStore]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'HelmetStore', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\HelmetStore.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'HelmetStore_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\HelmetStore_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [HelmetStore] SET COMPATIBILITY_LEVEL = 130
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [HelmetStore].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [HelmetStore] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [HelmetStore] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [HelmetStore] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [HelmetStore] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [HelmetStore] SET ARITHABORT OFF 
GO
ALTER DATABASE [HelmetStore] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [HelmetStore] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [HelmetStore] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [HelmetStore] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [HelmetStore] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [HelmetStore] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [HelmetStore] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [HelmetStore] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [HelmetStore] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [HelmetStore] SET  DISABLE_BROKER 
GO
ALTER DATABASE [HelmetStore] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [HelmetStore] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [HelmetStore] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [HelmetStore] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [HelmetStore] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [HelmetStore] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [HelmetStore] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [HelmetStore] SET RECOVERY FULL 
GO
ALTER DATABASE [HelmetStore] SET  MULTI_USER 
GO
ALTER DATABASE [HelmetStore] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [HelmetStore] SET DB_CHAINING OFF 
GO
ALTER DATABASE [HelmetStore] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [HelmetStore] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [HelmetStore] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'HelmetStore', N'ON'
GO
ALTER DATABASE [HelmetStore] SET QUERY_STORE = OFF
GO
USE [HelmetStore]
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [HelmetStore]
GO
/****** Object:  Table [dbo].[chitietdonhang]    Script Date: 2/27/2025 2:54:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chitietdonhang](
	[machitietdonhang] [varchar](255) NOT NULL,
	[madonhang] [varchar](255) NULL,
	[makhachhang] [varchar](30) NULL,
	[masanpham] [varchar](255) NULL,
	[trangthaidonhang] [varchar](255) NULL,
	[phuongthucthanhtoan] [varchar](255) NULL,
	[trangthaithanhtoan] [varchar](255) NULL,
	[ngaydathang] [datetime] NULL,
	[ngaygiaohangdukien] [datetime] NULL,
	[diachigiaohang] [varchar](255) NULL,
	[soluongsanphammua] [int] NULL,
	[tienvanchuyen] [decimal](10, 0) NULL,
	[vat] [int] NULL,
	[tongtien] [decimal](10, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[machitietdonhang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[donhang]    Script Date: 2/27/2025 2:54:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[donhang](
	[madonhang] [varchar](255) NOT NULL,
	[makhachhang] [varchar](30) NULL,
	[masanpham] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[madonhang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[khachhang]    Script Date: 2/27/2025 2:54:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khachhang](
	[makhachhang] [varchar](30) NOT NULL,
	[tendangnhap] [varchar](255) NULL,
	[matkhau] [varchar](255) NULL,
	[hovaten] [nvarchar](255) NULL,
	[gioitinh] [nvarchar](100) NULL,
	[ngaysinh] [date] NULL,
	[sodienthoai] [varchar](50) NULL,
	[email] [varchar](50) NULL,
	[quoctich] [nvarchar](255) NULL,
	[diachikhachhang] [nvarchar](255) NULL,
	[diachinhanhang] [nvarchar](255) NULL,
	[dangkynhanbangtin] [tinyint] NULL,
	[maxacthuc] [varchar](50) NULL,
	[thoigianhieulucmaxacthuc] [datetime] NULL,
	[trangthaixacthuc] [tinyint] NULL,
	[hinhavatar] [varchar](255) NULL,
 CONSTRAINT [PK__khachhan__52F5E8387D0B744A] PRIMARY KEY CLUSTERED 
(
	[makhachhang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[khachhang_magiamgia]    Script Date: 2/27/2025 2:54:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khachhang_magiamgia](
	[makhachhang] [varchar](30) NOT NULL,
	[idmagiamgia] [varchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[makhachhang] ASC,
	[idmagiamgia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[magiamgia]    Script Date: 2/27/2025 2:54:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[magiamgia](
	[idmagiamgia] [varchar](255) NOT NULL,
	[tenmagiamgia] [nvarchar](max) NULL,
	[tilegiam] [int] NOT NULL,
	[ngayhethan] [datetime] NOT NULL,
	[soluong] [int] NULL,
	[hinhanhvoucher] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[idmagiamgia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[sanpham]    Script Date: 2/27/2025 2:54:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sanpham](
	[masanpham] [varchar](255) NOT NULL,
	[tensanpham] [nvarchar](255) NULL,
	[hinhanhsanpham] [varchar](255) NULL,
	[mausac] [nvarchar](255) NULL,
	[kichco] [varchar](10) NULL,
	[soluong] [int] NULL,
	[kieumau] [nvarchar](255) NULL,
	[gianhap] [decimal](10, 0) NULL,
	[giaban] [decimal](10, 0) NULL,
	[giamgia] [int] NULL,
	[mota] [nvarchar](255) NULL,
 CONSTRAINT [PK__sanpham__8F121B2FB233B578] PRIMARY KEY CLUSTERED 
(
	[masanpham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[khachhang] ([makhachhang], [tendangnhap], [matkhau], [hovaten], [gioitinh], [ngaysinh], [sodienthoai], [email], [quoctich], [diachikhachhang], [diachinhanhang], [dangkynhanbangtin], [maxacthuc], [thoigianhieulucmaxacthuc], [trangthaixacthuc], [hinhavatar]) VALUES (N'1740154603317', N'1', N'1', N'Lại Thành Nhật Thiên', N'male', CAST(N'2025-02-13' AS Date), N'2424', N'thienisme2004@gmail.com', N'24242', N'rrrr', NULL, 1, N'695783', CAST(N'2025-02-24T15:10:29.000' AS DateTime), 1, N'1.jpeg')
INSERT [dbo].[khachhang] ([makhachhang], [tendangnhap], [matkhau], [hovaten], [gioitinh], [ngaysinh], [sodienthoai], [email], [quoctich], [diachikhachhang], [diachinhanhang], [dangkynhanbangtin], [maxacthuc], [thoigianhieulucmaxacthuc], [trangthaixacthuc], [hinhavatar]) VALUES (N'1740161865370', N'tai', N'123', N'Tai', N'female', CAST(N'2025-01-29' AS Date), N'sadfasf', N'nguyenhonghieutai7a9@gmail.com', N'fasf', N'safsa', NULL, 0, NULL, NULL, NULL, N'')
INSERT [dbo].[khachhang] ([makhachhang], [tendangnhap], [matkhau], [hovaten], [gioitinh], [ngaysinh], [sodienthoai], [email], [quoctich], [diachikhachhang], [diachinhanhang], [dangkynhanbangtin], [maxacthuc], [thoigianhieulucmaxacthuc], [trangthaixacthuc], [hinhavatar]) VALUES (N'1740161865375', N'2', N'2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)
INSERT [dbo].[khachhang] ([makhachhang], [tendangnhap], [matkhau], [hovaten], [gioitinh], [ngaysinh], [sodienthoai], [email], [quoctich], [diachikhachhang], [diachinhanhang], [dangkynhanbangtin], [maxacthuc], [thoigianhieulucmaxacthuc], [trangthaixacthuc], [hinhavatar]) VALUES (N'KH001', N'nguyenan', N'password123', N'Nguyễn An', N'Nam', CAST(N'1995-05-20' AS Date), N'0987654321', N'nguyenan@example.com', N'Việt Nam', N'Hà Nội', N'Hồ Chí Minh', 1, NULL, NULL, NULL, NULL)
INSERT [dbo].[khachhang] ([makhachhang], [tendangnhap], [matkhau], [hovaten], [gioitinh], [ngaysinh], [sodienthoai], [email], [quoctich], [diachikhachhang], [diachinhanhang], [dangkynhanbangtin], [maxacthuc], [thoigianhieulucmaxacthuc], [trangthaixacthuc], [hinhavatar]) VALUES (N'KH002', N'tranbinh', N'securepass', N'Trần Bình', N'Nam', CAST(N'1998-09-15' AS Date), N'0912345678', N'tranbinh@example.com', N'Việt Nam', N'Đà Nẵng', N'Đà Nẵng', 0, NULL, NULL, NULL, NULL)
INSERT [dbo].[khachhang_magiamgia] ([makhachhang], [idmagiamgia]) VALUES (N'1740154603317', N'1')
INSERT [dbo].[magiamgia] ([idmagiamgia], [tenmagiamgia], [tilegiam], [ngayhethan], [soluong], [hinhanhvoucher]) VALUES (N'1', N'Gi?m 25% cho don hàng t? 100k', 25, CAST(N'2025-02-20T00:00:00.000' AS DateTime), 5, NULL)
INSERT [dbo].[magiamgia] ([idmagiamgia], [tenmagiamgia], [tilegiam], [ngayhethan], [soluong], [hinhanhvoucher]) VALUES (N'3', N'Mã gi?m giá T?t', 10, CAST(N'2025-02-28T00:00:00.000' AS DateTime), NULL, NULL)
INSERT [dbo].[magiamgia] ([idmagiamgia], [tenmagiamgia], [tilegiam], [ngayhethan], [soluong], [hinhanhvoucher]) VALUES (N'9', N'Mã giảm giá Tết', 10, CAST(N'2025-02-28T00:00:00.000' AS DateTime), NULL, NULL)
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP001', N'1', N'1.png', N'Đen', N'M', 50, N'Trẻ trung', CAST(100000 AS Decimal(10, 0)), CAST(150000 AS Decimal(10, 0)), 10, N'Áo thun cotton cao cấp')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP002', N'2', N'1.png', N'Trắng', N'S', 30, N'Công sở', CAST(120000 AS Decimal(10, 0)), CAST(180000 AS Decimal(10, 0)), 5, N'Áo sơ mi vải lụa mềm')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP003', N'3', N'1.png', N'Xanh đậm', N'32', 40, N'Cá tính', CAST(200000 AS Decimal(10, 0)), CAST(300000 AS Decimal(10, 0)), 15, N'Quần jean ống đứng')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP004', N'4', N'1.png', N'Hồng pastel', N'L', 25, N'Nữ tính', CAST(250000 AS Decimal(10, 0)), CAST(350000 AS Decimal(10, 0)), 20, N'Váy xòe công chúa')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP005', N'5', N'1.png', N'Trắng', N'42', 60, N'Trẻ trung', CAST(300000 AS Decimal(10, 0)), CAST(450000 AS Decimal(10, 0)), 10, N'Giày thể thao phong cách Hàn Quốc')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP006', N'6', N'1.png', N'Đen', N'Free size', 100, N'Thời trang', CAST(50000 AS Decimal(10, 0)), CAST(100000 AS Decimal(10, 0)), 5, N'Mũ vải cotton chống nắng')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP007', N'7', N'1.png', N'Xám', N'XL', 35, N'Phong cách', CAST(180000 AS Decimal(10, 0)), CAST(250000 AS Decimal(10, 0)), 10, N'Áo hoodie có túi trước')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP008', N'8', N'1.png', N'Đen', N'40L', 20, N'Tiện dụng', CAST(350000 AS Decimal(10, 0)), CAST(500000 AS Decimal(10, 0)), 15, N'Balo chống nước đựng laptop 15.6 inch')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP009', N'9', N'1.png', N'Bạc', N'40mm', 15, N'Lịch lãm', CAST(500000 AS Decimal(10, 0)), CAST(700000 AS Decimal(10, 0)), 10, N'Đồng hồ dây thép không gỉ')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP010', N'10', N'1.png', N'Đen', N'Free size', 50, N'Trẻ trung', CAST(100000 AS Decimal(10, 0)), CAST(200000 AS Decimal(10, 0)), 5, N'Kính chống tia UV')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP011', N'11', N'1.png', N'Nâu', N'Medium', 30, N'Thanh lịch', CAST(400000 AS Decimal(10, 0)), CAST(600000 AS Decimal(10, 0)), 20, N'Túi da PU cao cấp')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP012', N'12', N'1.png', N'Xanh navy', N'L', 10, N'Lịch lãm', CAST(800000 AS Decimal(10, 0)), CAST(1200000 AS Decimal(10, 0)), 5, N'Bộ vest công sở cao cấp')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP013', N'13', N'1.png', N'Đỏ', N'37', 20, N'Nữ tính', CAST(250000 AS Decimal(10, 0)), CAST(400000 AS Decimal(10, 0)), 15, N'Giày cao gót 7cm')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP014', N'14', N'1.png', N'Be', N'Free size', 40, N'Thời trang', CAST(150000 AS Decimal(10, 0)), CAST(250000 AS Decimal(10, 0)), 10, N'Khăn len giữ ấm mùa đông')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP015', N'15', N'1.png', N'Xanh', N'M', 50, N'Mùa hè', CAST(180000 AS Decimal(10, 0)), CAST(270000 AS Decimal(10, 0)), 5, N'Quần short kaki co giãn')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP016', N'16', N'1.png', N'Cam', N'S', 25, N'Ấm áp', CAST(220000 AS Decimal(10, 0)), CAST(320000 AS Decimal(10, 0)), 10, N'Áo len dày giữ nhiệt')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP017', N'17', N'1.png', N'Vàng', N'Adjustable', 60, N'Trang sức', CAST(50000 AS Decimal(10, 0)), CAST(100000 AS Decimal(10, 0)), 15, N'Vòng tay phong thủy')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP018', N'18', N'1.png', N'Xám', N'XL', 35, N'Năng động', CAST(250000 AS Decimal(10, 0)), CAST(350000 AS Decimal(10, 0)), 10, N'Bộ đồ thể thao co giãn')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP019', N'19', N'1.png', N'Xanh rêu', N'Free size', 40, N'Trendy', CAST(70000 AS Decimal(10, 0)), CAST(150000 AS Decimal(10, 0)), 5, N'Nón bucket cá tính')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP020', N'20', N'1.png', N'Xám', N'L', 20, N'Sang trọng', CAST(500000 AS Decimal(10, 0)), CAST(750000 AS Decimal(10, 0)), 10, N'Áo khoác dạ cao cấp')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP021', N'21', N'1.png', N'Ð?', N'M', 50, N'Tr? trung', CAST(120000 AS Decimal(10, 0)), CAST(180000 AS Decimal(10, 0)), 5, N'Áo thun cotton...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP022', N'22', N'1.png', N'Xanh', N'L', 40, N'Công s?', CAST(150000 AS Decimal(10, 0)), CAST(200000 AS Decimal(10, 0)), 10, N'Áo so mi...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP023', N'23', N'1.png', N'Vàng', N'XL', 30, N'Cá tính', CAST(200000 AS Decimal(10, 0)), CAST(300000 AS Decimal(10, 0)), 15, N'Qu?n jean...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP024', N'24', N'1.png', N'Tr?ng', N'Free size', 20, N'N? tính', CAST(250000 AS Decimal(10, 0)), CAST(350000 AS Decimal(10, 0)), 10, N'Váy công s?...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP025', N'25', N'1.png', N'Ðen', N'S', 50, N'Th? thao', CAST(100000 AS Decimal(10, 0)), CAST(150000 AS Decimal(10, 0)), 5, N'Giày th? thao...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP026', N'26', N'1.png', N'Xám', N'M', 35, N'Phong cách', CAST(180000 AS Decimal(10, 0)), CAST(250000 AS Decimal(10, 0)), 10, N'Mu len...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP027', N'27', N'1.png', N'H?ng', N'L', 60, N'Nang d?ng', CAST(220000 AS Decimal(10, 0)), CAST(320000 AS Decimal(10, 0)), 15, N'Balo th?i trang...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP028', N'28', N'1.png', N'Xanh rêu', N'M', 45, N'L?ch lãm', CAST(300000 AS Decimal(10, 0)), CAST(400000 AS Decimal(10, 0)), 5, N'Ð?ng h?...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP029', N'29', N'1.png', N'Xanh navy', N'Free size', 50, N'C? di?n', CAST(500000 AS Decimal(10, 0)), CAST(700000 AS Decimal(10, 0)), 10, N'Áo vest...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP030', N'30', N'1.png', N'Be', N'XL', 20, N'N? tính', CAST(250000 AS Decimal(10, 0)), CAST(350000 AS Decimal(10, 0)), 5, N'Khan len...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP031', N'31', N'1.png', N'Xám', N'S', 40, N'Mùa hè', CAST(180000 AS Decimal(10, 0)), CAST(270000 AS Decimal(10, 0)), 10, N'Qu?n short...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP032', N'32', N'1.png', N'Ð?', N'L', 30, N'?m áp', CAST(150000 AS Decimal(10, 0)), CAST(250000 AS Decimal(10, 0)), 15, N'Áo len...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP033', N'33', N'1.png', N'Cam', N'M', 50, N'Trang s?c', CAST(400000 AS Decimal(10, 0)), CAST(600000 AS Decimal(10, 0)), 5, N'Nh?n b?c...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP034', N'34', N'1.png', N'H?ng', N'L', 60, N'Phong cách', CAST(350000 AS Decimal(10, 0)), CAST(500000 AS Decimal(10, 0)), 10, N'Balo laptop...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP035', N'35', N'1.png', N'Xanh', N'Free size', 70, N'Công s?', CAST(280000 AS Decimal(10, 0)), CAST(380000 AS Decimal(10, 0)), 10, N'Giày da...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP036', N'36', N'1.png', N'Xám', N'XL', 20, N'Thanh l?ch', CAST(300000 AS Decimal(10, 0)), CAST(450000 AS Decimal(10, 0)), 10, N'Áo khoác d?...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP037', N'37', N'1.png', N'Tr?ng', N'S', 50, N'L?ch lãm', CAST(120000 AS Decimal(10, 0)), CAST(180000 AS Decimal(10, 0)), 5, N'Áo so mi...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP038', N'38', N'1.png', N'Xanh navy', N'L', 30, N'Cá tính', CAST(150000 AS Decimal(10, 0)), CAST(200000 AS Decimal(10, 0)), 10, N'Qu?n jean...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP039', N'39', N'1.png', N'H?ng pastel', N'M', 40, N'N? tính', CAST(200000 AS Decimal(10, 0)), CAST(300000 AS Decimal(10, 0)), 15, N'Váy công s?...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP040', N'40', N'1.png', N'Xám', N'Free size', 20, N'Trendy', CAST(250000 AS Decimal(10, 0)), CAST(350000 AS Decimal(10, 0)), 10, N'Áo len cao c?p...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP041', N'41', N'1.png', N'Ðen', N'M', 50, N'Th?i trang', CAST(100000 AS Decimal(10, 0)), CAST(150000 AS Decimal(10, 0)), 5, N'Giày th? thao...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP042', N'42', N'1.png', N'Xanh', N'L', 35, N'Phong cách', CAST(180000 AS Decimal(10, 0)), CAST(250000 AS Decimal(10, 0)), 10, N'Mu len cotton...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP043', N'43', N'1.png', N'Vàng', N'S', 60, N'Nang d?ng', CAST(220000 AS Decimal(10, 0)), CAST(320000 AS Decimal(10, 0)), 15, N'Balo du l?ch...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP044', N'44', N'1.png', N'Tr?ng', N'M', 45, N'L?ch lãm', CAST(300000 AS Decimal(10, 0)), CAST(400000 AS Decimal(10, 0)), 5, N'Ð?ng h? dây da...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP045', N'45', N'1.png', N'Xanh rêu', N'Free size', 50, N'C? di?n', CAST(500000 AS Decimal(10, 0)), CAST(700000 AS Decimal(10, 0)), 10, N'Áo vest công s?...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP046', N'46', N'1.png', N'H?ng', N'XL', 20, N'N? tính', CAST(250000 AS Decimal(10, 0)), CAST(350000 AS Decimal(10, 0)), 5, N'Khan choàng len...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP047', N'47', N'1.png', N'Xám', N'S', 40, N'Mùa hè', CAST(180000 AS Decimal(10, 0)), CAST(270000 AS Decimal(10, 0)), 10, N'Qu?n short kaki...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP048', N'48', N'1.png', N'Ð?', N'L', 30, N'?m áp', CAST(150000 AS Decimal(10, 0)), CAST(250000 AS Decimal(10, 0)), 15, N'Áo len c? l?...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP049', N'49', N'1.png', N'Cam', N'M', 50, N'Trang s?c', CAST(400000 AS Decimal(10, 0)), CAST(600000 AS Decimal(10, 0)), 5, N'Nh?n b?c phong th?y...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP050', N'50', N'1.png', N'H?ng pastel', N'L', 60, N'Phong cách', CAST(350000 AS Decimal(10, 0)), CAST(500000 AS Decimal(10, 0)), 10, N'Balo công s?...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP051', N'51', N'1.png', N'Xanh', N'Free size', 70, N'Công s?', CAST(280000 AS Decimal(10, 0)), CAST(380000 AS Decimal(10, 0)), 10, N'Giày da nam...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP052', N'52', N'1.png', N'Xám', N'XL', 20, N'Thanh l?ch', CAST(300000 AS Decimal(10, 0)), CAST(450000 AS Decimal(10, 0)), 10, N'Áo khoác da...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP053', N'53', N'1.png', N'Tr?ng', N'S', 50, N'L?ch lãm', CAST(120000 AS Decimal(10, 0)), CAST(180000 AS Decimal(10, 0)), 5, N'Áo so mi tr?ng...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP054', N'54', N'1.png', N'Xanh navy', N'L', 30, N'Cá tính', CAST(150000 AS Decimal(10, 0)), CAST(200000 AS Decimal(10, 0)), 10, N'Qu?n jean rách...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP055', N'55', N'1.png', N'H?ng pastel', N'M', 40, N'N? tính', CAST(200000 AS Decimal(10, 0)), CAST(300000 AS Decimal(10, 0)), 15, N'Váy công s? d?p...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP056', N'56', N'1.png', N'Xám', N'Free size', 20, N'Trendy', CAST(250000 AS Decimal(10, 0)), CAST(350000 AS Decimal(10, 0)), 10, N'Áo len mùa dông...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP057', N'57', N'1.png', N'Ðen', N'M', 50, N'Th?i trang', CAST(100000 AS Decimal(10, 0)), CAST(150000 AS Decimal(10, 0)), 5, N'Giày sneaker...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP058', N'58', N'1.png', N'Xanh', N'L', 35, N'Phong cách', CAST(180000 AS Decimal(10, 0)), CAST(250000 AS Decimal(10, 0)), 10, N'Mu len phong cách...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP059', N'59', N'1.png', N'Vàng', N'S', 60, N'Nang d?ng', CAST(220000 AS Decimal(10, 0)), CAST(320000 AS Decimal(10, 0)), 15, N'Balo laptop ch?ng s?c...')
INSERT [dbo].[sanpham] ([masanpham], [tensanpham], [hinhanhsanpham], [mausac], [kichco], [soluong], [kieumau], [gianhap], [giaban], [giamgia], [mota]) VALUES (N'SP060', N'60', N'1.png', N'Tr?ng', N'M', 45, N'L?ch lãm', CAST(300000 AS Decimal(10, 0)), CAST(400000 AS Decimal(10, 0)), 5, N'Ð?ng h? kim lo?i...')
ALTER TABLE [dbo].[chitietdonhang]  WITH CHECK ADD FOREIGN KEY([madonhang])
REFERENCES [dbo].[donhang] ([madonhang])
GO
ALTER TABLE [dbo].[donhang]  WITH CHECK ADD  CONSTRAINT [FK__donhang__makhach__2E1BDC42] FOREIGN KEY([makhachhang])
REFERENCES [dbo].[khachhang] ([makhachhang])
GO
ALTER TABLE [dbo].[donhang] CHECK CONSTRAINT [FK__donhang__makhach__2E1BDC42]
GO
ALTER TABLE [dbo].[donhang]  WITH CHECK ADD  CONSTRAINT [FK__donhang__masanph__2F10007B] FOREIGN KEY([masanpham])
REFERENCES [dbo].[sanpham] ([masanpham])
GO
ALTER TABLE [dbo].[donhang] CHECK CONSTRAINT [FK__donhang__masanph__2F10007B]
GO
ALTER TABLE [dbo].[khachhang_magiamgia]  WITH CHECK ADD FOREIGN KEY([idmagiamgia])
REFERENCES [dbo].[magiamgia] ([idmagiamgia])
GO
ALTER TABLE [dbo].[khachhang_magiamgia]  WITH CHECK ADD  CONSTRAINT [FK__khachhang__makha__30F848ED] FOREIGN KEY([makhachhang])
REFERENCES [dbo].[khachhang] ([makhachhang])
GO
ALTER TABLE [dbo].[khachhang_magiamgia] CHECK CONSTRAINT [FK__khachhang__makha__30F848ED]
GO
USE [master]
GO
ALTER DATABASE [HelmetStore] SET  READ_WRITE 
GO
