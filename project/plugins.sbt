resolvers += Resolver.sonatypeRepo("snapshots")
addSbtPlugin("edu.gemini"     % "sbt-lucuma-lib"    % "0.6-16bd6e7-SNAPSHOT")
addSbtPlugin(("ch.epfl.scala" % "sbt-scalafix"      % "0.9.34").cross(CrossVersion.for3Use2_13))
addSbtPlugin("com.eed3si9n"   % "sbt-projectmatrix" % "0.9.0")
