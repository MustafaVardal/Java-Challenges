/*
	As described earlier, a stream can be defined as a sequence of data. The InputStream is used to read data from a source and the OutputStream is used for writing data to a destination.
*/

// FileInputStream

/*
	This stream is used for reading data from the files. Objects can be created using the keyword new and there are several types of constructors available.
	
	Following constructor takes a file name as a string to create an input stream object to read the file −
	
	InputStream f = FileInputStream("C:/java/hello");
	
	Following constructor takes a file object to create an input stream object to read the file. First we create a file object using File() method as follows -
	File f = new File("C:/java/hello");
	InputStream f = new FileInputStream(f);
	
	Methods: 
	public void close() throws IOException{}

	This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.
	
		
	protected void finalize()throws IOException {}

	This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.
	
	public int read(int r)throws IOException{}

	This method reads the specified byte of data from the InputStream. Returns an int. Returns the next byte of data and -1 will be returned if it's the end of the file.
	
	public int read(byte[] r) throws IOException{}

	This method reads r.length bytes from the input stream into an array. Returns the total number of bytes read. If it is the end of the file, -1 will be returned.
	
	public int available() throws IOException{}

	Gives the number of bytes that can be read from this file input stream. Returns an int.
*/

/*
	FileOutputStream is used to create a file and write data into it. The stream would create a file, if it doesn't already exist, before opening it for output.

	Here are two constructors which can be used to create a FileOutputStream object.

	Following constructor takes a file name as a string to create an input stream object to write the file −
	OutputStream f = new FileOutputStream("C:/java/hello") 
	
	constructor takes a file object to create an output stream object to write the file.
	
	File f = new File("C:/java/hello");
	
	OutputStream f = new FileOutputStream(f);

	public void close() throws IOException{}

	This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.


	protected void finalize()throws IOException {}

	This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.


	public void write(int w)throws IOException{}

	This methods writes the specified byte to the output stream.


	public void write(byte[] w)

	Writes w.length bytes from the mentioned byte array to the OutputStream.
*/