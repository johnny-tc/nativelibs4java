package com.nativelibs4java.opencl.library;
/**
 * JNA Wrapper for library <b>OpenGL</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public interface OpenGLApple extends com.sun.jna.Library {
	//public static final java.lang.String JNA_LIBRARY_NAME = com.ochafik.lang.jnaerator.runtime.LibraryExtractor.getLibraryPath("OpenGL", true, OpenGLApple.class);
	//public static final com.sun.jna.NativeLibrary JNA_NATIVE_LIB = com.sun.jna.NativeLibrary.getInstance(OpenGLApple.JNA_LIBRARY_NAME, com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper.DEFAULT_OPTIONS);
	public static final OpenGLApple INSTANCE = (OpenGLApple)com.sun.jna.Native.loadLibrary("OpenGL", OpenGLApple.class);//OpenGLApple.JNA_LIBRARY_NAME, OpenGLApple.class, com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper.DEFAULT_OPTIONS);
	
	/// Original signature : <code>CGLShareGroupObj CGLGetShareGroup(CGLContextObj)</code>
	com.ochafik.lang.jnaerator.runtime.NativeSize CGLGetShareGroup(com.sun.jna.Pointer ctx);
	/**
	 * * Current context functions<br>
	 * Original signature : <code>CGLError CGLSetCurrentContext(CGLContextObj)</code>
	 */
	int CGLSetCurrentContext(com.sun.jna.Pointer ctx);
	/// Original signature : <code>CGLContextObj CGLGetCurrentContext()</code>
	com.sun.jna.Pointer CGLGetCurrentContext();
	
	/**
	 * * Version numbers<br>
	 * Original signature : <code>void CGLGetVersion(GLint*, GLint*)</code>
	 */
	void CGLGetVersion(java.nio.IntBuffer majorvers, java.nio.IntBuffer minorvers);
	/**
	 * * Convert an error code to a string<br>
	 * Original signature : <code>char* CGLErrorString(CGLError)</code><br>
	 * @param error @see CGLError
	 */
	java.lang.String CGLErrorString(int error);
}