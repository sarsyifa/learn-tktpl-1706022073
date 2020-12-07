//
// Created by D E L L on 07/12/2020.
//

#include <string.h>
#include <jni.h>

extern "C"
JNIEXPORT jstring

JNICALL
Java_id_ac_ui_cs_mobileprogramming_syifa_lab1_MainActivity_helloFromJNI(JNIEnv *env, jobject thiz, jstring input_name) {
    // TODO: implement helloFromJNI()
    const char *name = env -> GetStringUTFChars(input_name, NULL);
    char message[60] = "Hello ";

    strcat(message, name);

    env -> ReleaseStringUTFChars(input_name, name);
    return env->NewStringUTF(message);
}

