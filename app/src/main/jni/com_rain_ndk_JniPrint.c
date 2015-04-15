#include <com_rain_ndk_JniPrint.h>
#include <string.h>

JNIEXPORT jstring JNICALL Java_com_rain_ndk_JniPrint_printInput
  (JNIEnv *env, jclass cls, jstring str){
  return str;
  };