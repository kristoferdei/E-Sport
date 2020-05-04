import discord
from discord.ext import commands

bot = commands.Bot(command_prefix="!")
CHANNEL_ID = int(CHANNEL_ID)

@bot.command()
async def szia(ctx):
    await ctx.send("Szia!")

bot.run("YOUR-BOT-KEY-HERE")