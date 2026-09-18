name := "otus-scala-developer-homework"

version := "0.1"

scalaVersion := "2.13.18"

libraryDependencies ++= Seq(
  "com.typesafe.slick"      %% "slick"                                % "3.6.1",
  "org.flywaydb"            %  "flyway-core"                          % "13.5.0",
  "org.flywaydb"            %  "flyway-database-postgresql"           % "13.5.0",
  "org.postgresql"          %  "postgresql"                           % "42.7.13" % Test,
  "org.scalatest"           %% "scalatest"                            % "3.2.20"  % Test,
  "org.scalikejdbc"         %% "scalikejdbc"                          % "4.3.5"   % Test,
  "org.scalikejdbc"         %% "scalikejdbc-test"                     % "4.3.5"   % Test,
  "com.dimafeng"            %% "testcontainers-scala-postgresql"      % "0.44.1"  % Test,
  "com.dimafeng"            %% "testcontainers-scala-scalatest"       % "0.44.1"  % Test,
  "org.scalacheck"          %% "scalacheck"                           % "1.19.0"  % Test,
  "org.scalatestplus"       %% "scalacheck-1-19"                      % "3.2.20.0" % Test,
  "ch.qos.logback"          %  "logback-classic"                      % "1.5.18"  % Test
)
