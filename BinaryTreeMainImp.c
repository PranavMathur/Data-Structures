#include <jni.h>
#include "BinaryTreeMain.h"

JNIEXPORT jint JNICALL Java_BinaryTreeMain_add
  (JNIEnv *env, jobject obj, jint a, jint b);
{
   return a+b;
}   