class kartuperpus
{
	protected String nama, nim, fakultas, jurusan, alamat, no_tlp, NamaPerpus;
	//overload
	protected kartuperpus()
	{
		nama = " Dinda Meysya ";
		nim = " 1177050032";
		fakultas = " Saintek ";
		jurusan = " informatika ";
		alamat = " Karawang ";
		no_tlp = " 085719608278 ";
	}
	
	//overload
	protected kartuperpus(String nama, String nim, String fakultas, String jurusan, String alamat, String no_tlp, String NamaPerpus)
	{
		this.nama=nama;
		this.nim=nim;
		this.fakultas=fakultas;
		this.jurusan=jurusan;
		this.alamat=alamat;
		this.no_tlp=no_tlp;
	}
	//overide
	public void NamaPerpus()
	{
		System.out.println("Perpustakaan UIN Bandung");
	}
	
	public String getNama() 
	{
		return nama;
	}
	public String getNim() 
	{
		return nim;
	}
	public String getFakultas() 
	{
		return fakultas;
	}
	public String getJurusan() 
	{
		return jurusan;
	}
	public String getAlamat()
	{
		return alamat;
	}
	public String getNo_tlp()
	{
		return no_tlp;
	}
}