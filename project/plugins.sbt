resolvers += "jgit-repo" at "https://download.eclipse.org/jgit/maven"

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.4.0")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")

addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.9.3")

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.3")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.6.4")
