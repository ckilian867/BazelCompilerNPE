# BazelCompilerNPE

Bazel
=====
Install bazel - https://docs.bazel.build/versions/main/install.html

Run build with bazel
```
bazel build //example:problem
```

Stack Trace:

```
$ bazel build //example:problem --verbose_failures
INFO: Invocation ID: de05dacc-7f53-4ca2-8faf-189938ae0334
INFO: Analyzed target //example:problem (0 packages loaded, 0 targets configured).
INFO: Found 1 target...
ERROR: /home/user/compiler-npe/example/BUILD.bazel:8:13: Building example/libproblem.jar (1 source file) failed: (Exit 1): java failed: error executing command
  (cd /home/user/.cache/bazel/_bazel_cjk/c10459ab71c5ce3397369f65c4124488/execroot/__main__ && \
  exec env - \
    LC_CTYPE=en_US.UTF-8 \
    PATH=/opt/jvm/jdk-11/bin:/opt/python/3.9.2/bin:/opt/lda/pex_resources/scripts/binaries:/home/user/bin:/opt/git/bin:/home/user/go-repos:/opt/go/path/bin:/opt/go/root/bin:/usr/lib/jvm/adoptopenjdk-8-hotspot-amd64/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin \
  external/remotejdk11_linux/bin/java -XX:-CompactStrings '--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED' '--add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED' '--add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED' '--add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED' '--add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED' '--add-exports=jdk.compiler/com.sun.tools.javac.resources=ALL-UNNAMED' '--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED' '--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED' '--add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED' '--add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED' '--add-opens=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED' '--add-opens=java.base/java.nio=ALL-UNNAMED' '--add-opens=java.base/java.lang=ALL-UNNAMED' '--patch-module=java.compiler=external/remote_java_tools/java_tools/java_compiler.jar' '--patch-module=jdk.compiler=external/remote_java_tools/java_tools/jdk_compiler.jar' -jar external/remote_java_tools/java_tools/JavaBuilder_deploy.jar @bazel-out/k8-fastbuild/bin/example/libproblem.jar-0.params @bazel-out/k8-fastbuild/bin/example/libproblem.jar-1.params)
# Configuration: d762925729a1e18d6a8bccbddcd1576e4dff3530a38be61ea64828e89bea4b8e
# Execution platform: @local_config_platform//:host
compiler message file broken: key=compiler.misc.msg.bug arguments=11.0.12, {1}, {2}, {3}, {4}, {5}, {6}, {7}
java.lang.NullPointerException
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.visitApply(Flow.java:1235)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCMethodInvocation.accept(JCTree.java:1634)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:398)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.visitExec(TreeScanner.java:213)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCExpressionStatement.accept(JCTree.java:1452)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:398)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:57)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.visitBlock(Flow.java:997)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCBlock.accept(JCTree.java:1020)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:398)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.visitMethodDef(Flow.java:964)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCMethodDecl.accept(JCTree.java:866)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:398)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.visitClassDef(Flow.java:927)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCClassDecl.accept(JCTree.java:774)
	at jdk.compiler/com.sun.tools.javac.tree.TreeScanner.scan(TreeScanner.java:49)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$BaseAnalyzer.scan(Flow.java:398)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.analyzeTree(Flow.java:1327)
	at jdk.compiler/com.sun.tools.javac.comp.Flow$FlowAnalyzer.analyzeTree(Flow.java:1317)
	at jdk.compiler/com.sun.tools.javac.comp.Flow.analyzeTree(Flow.java:218)
	at jdk.compiler/com.sun.tools.javac.main.JavaCompiler.flow(JavaCompiler.java:1401)
	at com.google.devtools.build.buildjar.javac.BlazeJavaCompiler.flow(BlazeJavaCompiler.java:102)
	at jdk.compiler/com.sun.tools.javac.main.JavaCompiler.flow(JavaCompiler.java:1365)
	at jdk.compiler/com.sun.tools.javac.main.JavaCompiler.compile(JavaCompiler.java:960)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.lambda$doCall$0(JavacTaskImpl.java:104)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.handleExceptions(JavacTaskImpl.java:147)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.doCall(JavacTaskImpl.java:100)
	at com.google.devtools.build.buildjar.javac.BlazeJavacMain.compile(BlazeJavacMain.java:135)
	at com.google.devtools.build.buildjar.ReducedClasspathJavaLibraryBuilder.fallback(ReducedClasspathJavaLibraryBuilder.java:105)
	at com.google.devtools.build.buildjar.ReducedClasspathJavaLibraryBuilder.compileSources(ReducedClasspathJavaLibraryBuilder.java:67)
	at com.google.devtools.build.buildjar.SimpleJavaLibraryBuilder.compileJavaLibrary(SimpleJavaLibraryBuilder.java:110)
	at com.google.devtools.build.buildjar.SimpleJavaLibraryBuilder.run(SimpleJavaLibraryBuilder.java:118)
	at com.google.devtools.build.buildjar.BazelJavaBuilder.build(BazelJavaBuilder.java:101)
	at com.google.devtools.build.buildjar.BazelJavaBuilder.parseAndBuild(BazelJavaBuilder.java:81)
	at com.google.devtools.build.lib.worker.WorkRequestHandler$WorkRequestHandlerBuilder.lambda$new$0(WorkRequestHandler.java:259)
	at com.google.devtools.build.lib.worker.WorkRequestHandler$WorkRequestCallback.apply(WorkRequestHandler.java:225)
	at com.google.devtools.build.lib.worker.WorkRequestHandler.respondToRequest(WorkRequestHandler.java:382)
	at com.google.devtools.build.lib.worker.WorkRequestHandler.lambda$startResponseThread$1(WorkRequestHandler.java:357)
	at java.base/java.lang.Thread.run(Thread.java:829)
Target //example:problem failed to build
INFO: Elapsed time: 0.385s, Critical Path: 0.13s
INFO: 2 processes: 2 internal.
FAILED: Build did NOT complete successfully
```
