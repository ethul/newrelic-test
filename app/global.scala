import play.api.{Application, Logger, Mode, Play}, Play.current
import play.api.mvc._
import play.filters.gzip.GzipFilter

object Global extends WithFilters(new GzipFilter())
