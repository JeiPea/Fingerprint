package com.hdsoft.fingerprint;

public class LibFp {
	public static final int FP_OK          = 0x0000;
	public static final int FP_NO_FINGER   = 0x0002;
	public static final int FP_ERROR_OPEN  = 0x0102;
	public static final int FP_ERROR_DRIVE = 0x0104;
	
	static {
		System.loadLibrary("fp");
	}

	public static String GetError(int nCode)
	{
		String strText;
		switch (nCode)
		{  
		case 0:
			strText = "ִ�гɹ�";
			break;
		case 1:
			strText = "���ݰ����մ���";
			break;
		case 2:
			strText = "��������û����ָ";
			break;
		case 3:
			strText = "¼��ָ��ͼ��ʧ��";
			break;
		case 4:
			strText = "ָ��̫��";
			break;
		case 5:
			strText = "ָ��̫��";
			break;
		case 6:
			strText = "ָ��̫��";
			break;
		case 7:
			strText = "ָ��������̫��";
			break;
		case 8:
			strText = "ָ�Ʋ�ƥ��";
			break;
		case 9:
			strText = "û������ָ��";
			break;
		case 10:
			strText = "�����ϲ�ʧ��";
			break;
		case 11:
			strText = "��ַ�ų���ָ�ƿⷶΧ";
			break;
		case 12:
			strText = "��ָ�ƿ��ģ�����";
			break;
		case 13:
			strText = "�ϴ�����ʧ��";
			break;
		case 14:
			strText = "ģ�鲻�ܽ��պ������ݰ�";
			break;
		case 15:
			strText = "�ϴ�ͼ��ʧ��";
			break;
		case 16:
			strText = "ɾ��ģ��ʧ��";
			break;
		case 17:
			strText = "���ָ�ƿ�ʧ��";
			break;
		case 18:
			strText = "���ܽ�������";
			break;
		case 19:
			strText = "�����ȷ";
			break;
		case 20:
			strText = "ϵͳ��λʧ��";
			break;
		case 21:
			strText = "��Чָ��ͼ��";
			break;
		case 22:
			strText = "��������ʧ��";
			break;
		case 23:
			strText = "������δ�ƶ�";
			break;
		case 24:
			strText = "��ʾ��дFLASH����";
			break;
		case 25:
			strText = "δ�������";
			break;
		case 26:
			strText = "��Ч�Ĵ�����";
			break;
		case 27:
			strText = "�Ĵ����趨���ݴ����";
			break;
		case 28:
			strText = "���±�ҳ��ָ������";
			break;
		case 29:
			strText = "�˿ڲ���ʧ��";
			break;
		case 30:
			strText = "�Զ�ע�ᣨenroll��ʧ��";
			break;
		case 31:
			strText = "ָ�ƿ���";
			break;
		case 0xf0:
			strText = "�к������ݰ���ָ���ȷ���պ���0xf0Ӧ��";
			break;
		case 0xf1:
			strText = "�к������ݰ���ָ��������0xf1Ӧ��";
			break;
		case 0xf2:
			strText = "��ʾ��д�ڲ�FLASHʱ��У��ʹ���";
			break;	
		case 0xf3:
			strText = "��ʾ��д�ڲ�FLASHʱ������ʶ����";
			break;
		case 0xf4:
			strText = "��ʾ��д�ڲ�FLASHʱ�������ȴ���";
			break;
		case 0xf5:
			strText = "��ʾ��д�ڲ�FLASHʱ�����볤��̫��";
			break;
		case 0xf6:
			strText = "��ʾ��д�ڲ�FLASHʱ����дFLASHʧ��";
			break;
		case 0x20:
			strText = "�ղ���";
			break;	
		case 0x101:
			strText = "������ʼ��ʧ��";
			break;
		case 0x102:
			strText = "������ʧ��";
			break;
		case 0x103:
			strText = "������ʧ��";
			break;
		case 0x104:
			strText = "����δ��";
			break;
		case 0x105:
			strText = "�����ں�����ʧ��";
			break;
		case 0x106:
			strText = "��ȡ�����б�ʧ��";
			break;
		case 0x107:
			strText = "��ȡ��������ʧ��";
			break;
		case 0x200:
			strText = "��������ʧ��";
			break;
		case 0x301:
			strText = "Ӧ���У�����";
			break;
		case 0x302:
			strText = "�������ʧ��";
			break;
		case 0x303:
			strText = "���ݻ�����̫С";
			break;
		case 0x304:
			strText = "���ļ�ʧ��";
			break;
		default:
			strText = "δ֪����";
			break;
		}
		return strText +"["+ nCode +"]";
	}
	/***********************************************************************************************************
	* ��������: void GetVersion();
	* ��������: ��ȡ�������汾��
	* ���ز���: �汾��
	***********************************************************************************************************/
	public native int GetVersion();
	 
	/***********************************************************************************************************
	* ��������: void GetRootRight();
	* ��������: ��ȡ��������RootȨ��
	* ���ز���: ��
	***********************************************************************************************************/
	public static native void GetRootRight();
	
	/***********************************************************************************************************
	* ��������: int FpOpen();
	* ��������: ������
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpOpen();

	/***********************************************************************************************************
	* ��������: int  FpOpenEx(uint16_t idVendor, uint16_t idProduct);
	* ��������: �����û�ID����ƷID������
	* �������: �û�ID
	* �������: ��ƷID
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int  FpOpenEx(short idVendor, short idProduct);
	
	/***********************************************************************************************************
	* ��������: void FpClose();
	* ��������: �ر�����
	* ���ز���: ��
	***********************************************************************************************************/
	public static native void FpClose();

	/***********************************************************************************************************
	* ��������: int FpGetImage(uint32_t nAddr, uint32_t timeout)
	* ��������: ̽����ָ��̽�⵽��¼��ָ��ͼ�����ImageBuffer
	* �������: оƬ��ַ
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpGetImage(int nAddr, int timeout);

	/***********************************************************************************************************
	* ��������: int FpGenChar(uint32_t nAddr, uint8_t nBufferId, uint32_t timeout)
	* ��������: ��ImageBuffer �е�ԭʼͼ������ָ�������ļ�����CharBuffer1 ��CharBuffer2
	* �������: оƬ��ַ
	* �������: �����������ţ�Ҫ��ΪCharBuffer1=1��CharBuffer2=2
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpGenChar(int nAddr, byte nBufferId, int timeout);

	/***********************************************************************************************************
	* ��������: int FpMatch(uint32_t nAddr, uint16_t *pScore, uint32_t timeout)
	* ��������: ��ȷ�ȶ�CharBuffer1 ��CharBuffer2 �е������ļ�
	* �������: оƬ��ַ
	* �������: �ȶԵ÷�
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpMatch(int nAddr, short[] pScore, int timeout);

	/***********************************************************************************************************
	* ��������: int FpSearch(uint32_t nAddr, uint8_t nBufferId, uint16_t nStartPage, uint16_t nPageNum,
	*                        uint16_t *pPageId, uint16_t *pScore, uint32_t timeout)
	* ��������: ��CharBuffer1��CharBuffer2�е������ļ�����ָ��ָ�ƿ�
	* �������: оƬ��ַ
	* �������: �����������ţ�Ҫ��ΪCharBuffer1=1��CharBuffer2=2
	* �������: ������ʼҳ
	* �������: ����ҳ��
	* �������: ƥ��ҳ��
	* �������: �ȶԵ÷�
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpSearch(int nAddr, byte nBufferId, short nStartPage, short nPageNum, short[] pPageId, short[] pScore, int timeout);

	/***********************************************************************************************************
	* ��������: int FpRegModel(uint32_t nAddr, uint32_t timeout)
	* ��������: ��CharBuffer1��CharBuffer2�е������ļ��ϲ�����ģ�壬�������CharBuffer1��CharBuffer2
	* �������: оƬ��ַ
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpRegModel(int nAddr, int timeout);

	/***********************************************************************************************************
	* ��������: int FpStoreChar(uint32_t nAddr, uint8_t nBufferId, uint16_t nPageId, uint32_t timeout)
	* ��������: ��CharBuffer1��CharBuffer2�е�ģ���ļ��浽PageId��Flash ���ݿ�λ��
	* �������: оƬ��ַ
	* �������: �����������ţ�Ҫ��ΪCharBuffer1=1��CharBuffer2=2
	* �������: ָ�ƿ�λ�ú�
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpStoreChar(int nAddr, byte nBufferId, short nPageId, int timeout);

	/***********************************************************************************************************
	* ��������: int FpLoadChar(uint32_t nAddr, uint8_t nBufferId, uint16_t nPageId, uint32_t timeout)
	* ��������: ��Flash���ݿ���ָ��ID�ŵ�ָ��ģ����뵽ģ�建����CharBuffer1�� CharBuffer2
	* �������: оƬ��ַ
	* �������: �����������ţ�Ҫ��ΪCharBuffer1=1��CharBuffer2=2
	* �������: ָ�ƿ�λ�ú�
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpLoadChar(int nAddr, byte nBufferId, short nPageId, int timeout);

	/***********************************************************************************************************
	* ��������: int FpUpChar(uint32_t nAddr, uint8_t nBufferId, uint8_t *pBuf, int nBufSize, int *pBytesReturned, uint32_t timeout)
	* ��������: �������������е������ļ��ϴ�����λ��
	* �������: оƬ��ַ
	* �������: �����������ţ�Ҫ��ΪCharBuffer1=1��CharBuffer2=2
	* �������: ��������ַ
	* �������: ��������С
	* �������: ʵ�ʴ�С
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpUpChar(int nAddr, byte nBufferId, byte[] pBuf, int nBufSize, int[] pBytesReturned, int timeout);

	/***********************************************************************************************************
	* ��������: int FpDownChar(uint32_t nAddr, uint8_t nBufferId, uint8_t *pBuf, int nBufSize, uint32_t timeout)
	* ��������: ��λ�����������ļ���ģ���һ������������
	* �������: оƬ��ַ
	* �������: �����������ţ�Ҫ��ΪCharBuffer1=1��CharBuffer2=2
	* �������: ��������ַ
	* �������: ��������С
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpDownChar(int nAddr, byte nBufferId, byte[] pBuf, int nBufSize, int timeout);

	/***********************************************************************************************************
	* ��������: int FpUpImage(uint32_t nAddr, uint8_t *pBuf, int nBufSize, int *pBytesReturned, uint32_t timeout)
	* ��������: ��ͼ�񻺳����е������ϴ�����λ��
	* �������: оƬ��ַ
	* �������: ��������ַ
	* �������: ��������С
	* �������: ʵ�ʴ�С
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpUpImage(int nAddr, byte[] pBuf, int nBufSize, int[] pBytesReturned, int timeout);
	
	/***********************************************************************************************************
	* ��������: int FpUpBMP(uint32_t nAddr, uint8_t *pBuf, int nBufSize, int *pBytesReturned, uint32_t timeout)
	* ��������: ��ͼ�񻺳����е�����ת��ΪBMP�ϴ�����λ��
	* �������: оƬ��ַ
	* �������: ��������ַ
	* �������: ��������С
	* �������: ʵ�ʴ�С
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpUpBMP(int nAddr, byte[] pBuf, int nBufSize, int[] pBytesReturned, int timeout);

	/***********************************************************************************************************
	* ��������: int FpDownImage(uint32_t nAddr, uint8_t *pBuf, int nBufSize, uint32_t timeout)
	* ��������: ��ͼ�񻺳����е������ϴ�����λ��
	* �������: оƬ��ַ
	* �������: ��������ַ
	* �������: ��������С
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpDownImage(int nAddr, byte[] pBuf, int nBufSize, int timeout);

	/***********************************************************************************************************
	* ��������: int FpDeletChar(uint32_t nAddr, uint16_t nStartPage, uint16_t nPageNum, uint32_t timeout)
	* ��������: ɾ��Flash���ݿ���ָ��ID�ſ�ʼ��N��ָ��ģ��
	* �������: оƬ��ַ
	* �������: ��ʼҳ
	* �������: ҳ��
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpDeletChar(int nAddr, short nStartPage, short nPageNum, int timeout);

	/***********************************************************************************************************
	* ��������: int FpEmpty(uint32_t nAddr, uint32_t timeout)
	* ��������: ɾ��Flash ���ݿ�������ָ��ģ��
	* �������: оƬ��ַ
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpEmpty(int nAddr, int timeout);

	/***********************************************************************************************************
	* ��������: int FpWriteReg(uint32_t nAddr, uint8_t nReg, uint8_t nValue, uint32_t timeout)
	* ��������: дģ��Ĵ���
	* �������: оƬ��ַ
	* �������: �Ĵ�����ַ
	* �������: �Ĵ�����ֵ
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpWriteReg(int nAddr, byte nReg, byte nValue, int timeout);

	/***********************************************************************************************************
	* ��������: int FpReadSysParam(uint32_t nAddr, uint8_t *pBuf, uint8_t nBufSize, uint8_t *pBytesReturned, uint32_t timeout)
	* ��������: ��ȡģ��Ļ�������,�̶�16�ֽ�
	* �������: оƬ��ַ
	* �������: ��������ַ
	* �������: ��������С
	* �������: ʵ�ʴ�С
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpReadSysParam(int nAddr, byte[] pBuf, int nBufSize, int[] pBytesReturned, int timeout);

	/***********************************************************************************************************
	* ��������: int FpEnroll(uint32_t nAddr, uint16_t *pPageId, uint32_t timeout)
	* ��������: �ɼ�һ��ָ��ע��ģ�壬��ָ�ƿ���������λ���洢�����ش洢ID
	* �������: оƬ��ַ
	* �������: �洢ҳ��
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpEnroll(int nAddr, short[] pPageId, int timeout);

	/***********************************************************************************************************
	* ��������: int FpIdentify(uint32_t nAddr, uint16_t *pPageId, uint16_t *pScore, uint32_t timeout)
	* ��������: �Զ��ɼ�ָ�ƣ���ָ�ƿ�������Ŀ��ģ�岢�����������
	* �������: оƬ��ַ
	* �������: �洢ҳ��
	* �������: �ȶԵ÷�
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpIdentify(int nAddr, short[] pPageId, short[] pScore, int timeout);

	/***********************************************************************************************************
	* ��������: int FpSetPwd(uint32_t nAddr, uint8_t *pBuf, int nBufSize, uint32_t timeout)
	* ��������: ����ģ�����ֿ���
	* �������: оƬ��ַ
	* �������: ���뻺������ַ
	* �������: ���뻺������С,Ҫ��Ϊ4
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpSetPwd(int nAddr, byte[] pBuf, int nBufSize, int timeout);

	/***********************************************************************************************************
	* ��������: int FpVfyPwd(uint32_t nAddr, uint8_t *pBuf, int nBufSize, uint32_t timeout)
	* ��������: ��֤ģ�����ֿ���
	* �������: оƬ��ַ
	* �������: ���뻺������ַ
	* �������: ���뻺������С,Ҫ��Ϊ4
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpVfyPwd(int nAddr, byte[] pBuf, int nBufSize, int timeout);

	/***********************************************************************************************************
	* ��������: int FpGetRandom(uint32_t nAddr, uint32_t *pRandom, uint32_t timeout)
	* ��������: ��оƬ����һ������������ظ���λ��
	* �������: оƬ��ַ
	* �������: �������ַ
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpGetRandom(int nAddr, int[] pRandom, int timeout);

	/***********************************************************************************************************
	* ��������: int FpSetChipAddr(uint32_t nAddr, uint32_t nChip, uint32_t timeout)
	* ��������: ����оƬ��ַ
	* �������: ��оƬ��ַ
	* �������: ��оƬ��ַ
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpSetChipAddr(int nAddr, int nChip, int timeout);

	/***********************************************************************************************************
	* ��������: int FpReadInfPage(uint32_t nAddr, uint8_t *pBuf, int nBufSize, int *pBytesReturned, uint32_t timeout)
	* ��������: д32�ֽ����ݵ�Flash�û���
	* �������: оƬ��ַ
	* �������: ��������ַ
	* �������: ��������С
	* �������: ʵ�ʴ�С
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpReadInfPage(int nAddr, byte[] pBuf, int nBufSize, int[] pBytesReturned, int timeout);
	
	/***********************************************************************************************************
	* ��������: int FpWriteNotepad(uint32_t nAddr, uint8_t nPageId, uint8_t *pBuf, int nBufSize, uint32_t timeout)
	* ��������: д32�ֽ����ݵ�Flash�û���
	* �������: оƬ��ַ
	* �������: �û���ҳ��
	* �������: ��������ַ
	* �������: ��������С��Ҫ�󲻴���32
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpWriteNotepad(int nAddr, byte nPageId, byte[] pBuf, int nBufSize, int timeout);

	/***********************************************************************************************************
	* ��������: int FpReadNotepad(uint32_t nAddr, uint8_t nPageId, uint8_t *pBuf, int nBufSize, int *pBytesReturned, uint32_t timeout)
	* ��������: ��FLASH�û�����ȡ32�ֽ�����
	* �������: оƬ��ַ
	* �������: �û���ҳ��
	* �������: ��������ַ
	* �������: ��������С��Ҫ�����32
	* �������: ʵ�ʴ�С
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpReadNotepad(int nAddr, byte nPageId, byte[] pBuf, int nBufSize, int[] pBytesReturned, int timeout);

	/***********************************************************************************************************
	* ��������: int FpHighSpeedSearch(uint32_t nAddr, uint8_t nBufferId, uint16_t nStartPage, uint16_t nPageNum,
	*                        uint16_t *pPageId, uint16_t *pScore, uint32_t timeout)
	* ��������: ��CharBuffer1��CharBuffer2�е������ļ���������ָ��ָ�ƿ�
	* �������: оƬ��ַ
	* �������: �����������ţ�Ҫ��ΪCharBuffer1=1��CharBuffer2=28
	* �������: ������ʼҳ
	* �������: ����ҳ��
	* �������: ƥ��ҳ��
	* �������: �ȶԵ÷�
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpHighSpeedSearch(int nAddr, byte nBufferId, short nStartPage, short nPageNum, short[] pPageId, short[] pScore, int timeout);

	/***********************************************************************************************************
	* ��������: int FpGenBinImage(uint32_t nAddr, uint8_t nBinType, uint32_t timeout)
	* ��������: ��ͼ�񻺳����е�ָ��ͼ����д�������ϸ��ָ��ͼ��
	* �������: оƬ��ַ
	* �������: ϸ������
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpGenBinImage(int nAddr, byte nBinType, int timeout);

	/***********************************************************************************************************
	* ��������: int FpValidTempleteNum(uint32_t nAddr, uint16_t *pNum, uint32_t timeout)
	* ��������: ����Чģ�����
	* �������: оƬ��ַ
	* �������: ģ�����
	* �������: �Ⱥ�ʱ��
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpValidTempleteNum(int nAddr, short[] pNum, int timeout);

	/***********************************************************************************************************
	* ��������: int FpMakeBMP(const uint8_t *pFile, uint8_t *pBuf, int nSize)
	* ��������: ����ͼ�����ݴ���BMP
	* �������: ȫ·�����ļ�����
	* �������: ���ݻ�������ַ
	* �������: ���ݻ�������С
	* ���ز���: ִ�н��
	***********************************************************************************************************/
	public static native int FpMakeBMP(String pFile, byte[] pBuf, int nSize);
}
