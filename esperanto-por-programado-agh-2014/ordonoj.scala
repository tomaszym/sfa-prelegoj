package pl.pej.formiko.grafeo.meta

import pl.pej.formiko.grafeo.{Vertico, Eĝo}
import akka.actor.ActorRef


case class KuniguEĝon(eĝo: Eĝo)

/** Disigas recivanton de la sendanto de tiu ĉi mesaĝo
*/
case class Disigu(id: VerticaId)

case class KuniguVerticon(id: VerticaId, eĝoRef: ActorRef)
case class KuniguVerticojn(
	unuaId: VerticaId, unuaRef: ActorRef,
	duaId: VerticaId, duaRef: ActorRef)

case class DisiguVerticon(vid: VerticaId)
