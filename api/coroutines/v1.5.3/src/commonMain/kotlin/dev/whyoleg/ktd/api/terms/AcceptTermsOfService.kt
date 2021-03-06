@file:Suppress(
    "unused"
)
@file:UseExperimental(
    BotsOnly::class,
    TestingOnly::class
)

package dev.whyoleg.ktd.api.terms

import dev.whyoleg.ktd.*
import dev.whyoleg.ktd.api.*
import dev.whyoleg.ktd.api.TdApi.*

/**
 * Accepts Telegram terms of services
 *
 * @termsOfServiceId - Terms of service identifier
 */
suspend fun TelegramClient.acceptTermsOfService(
    termsOfServiceId: String? = null
): Ok = terms(
    AcceptTermsOfService(
        termsOfServiceId
    )
)

/**
 * Accepts Telegram terms of services
 */
suspend fun TelegramClient.terms(
    f: AcceptTermsOfService
): Ok = exec(f) as Ok
